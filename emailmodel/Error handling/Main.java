// Main class to start the quiz application
public class Main {
    public static void main(String[] args) {
        QuizService quizService = new QuizService(); // Initialize QuizService
        QuizController quizController = new QuizController(quizService); // Initialize QuizController

        quizController.startQuiz(); // Start the quiz
    }
}
