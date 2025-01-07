import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class QuizTimerServlet extends HttpServlet {

    private static final int QUIZ_DURATION = 10 * 60 * 1000; // 10 minutes in milliseconds
    private static final int WARNING_TIME = 60 * 1000; // 1 minute warning before the time ends

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Initialize a session for the user if not already present
        HttpSession session = request.getSession(true);
        
        // Start the timer if it's not already started
        if (session.getAttribute("quizStartTime") == null) {
            session.setAttribute("quizStartTime", System.currentTimeMillis());
        }
        
        // Get the start time of the quiz from the session
        long startTime = (long) session.getAttribute("quizStartTime");
        
        // Calculate the elapsed time in milliseconds
        long elapsedTime = System.currentTimeMillis() - startTime;
        
        // Calculate the remaining time for the quiz
        long remainingTime = QUIZ_DURATION - elapsedTime;

        // If the remaining time is 0 or less, the quiz has ended
        if (remainingTime <= 0) {
            session.setAttribute("timeUp", true);
            response.sendRedirect("timeUp.jsp"); // Redirect to time-up page (you need to create timeUp.jsp)
        } else {
            // Convert remaining time to minutes and seconds
            long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingTime);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingTime) - TimeUnit.MINUTES.toSeconds(minutes);

            // Display the remaining time
            request.setAttribute("remainingMinutes", minutes);
            request.setAttribute("remainingSeconds", seconds);

            // Forward the request to the quiz page
            RequestDispatcher dispatcher = request.getRequestDispatcher("quiz.jsp");
            dispatcher.forward(request, response);
        }
    }
}
