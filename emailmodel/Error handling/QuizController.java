import java.util.List;
import java.util.Scanner;

// QuizController handles the interaction with the user
public class QuizController {
    private QuizService quizService;
    private Scanner scanner;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
        this.scanner = new Scanner(System.in);
    }

    // Main method to start the quiz
    public void startQuiz() {
        try {
            List<Question> questions = quizService.getQuestions(); // Fetch questions
            int score = 0;

            System.out.println("Welcome to the Quiz Application!");

            for (int i = 0; i < questions.size(); i++) {
                Question question = questions.get(i);
                System.out.println("\nQuestion " + (i + 1) + ": " + question.getQuestionText());
                for (String option : question.getOptions()) {
                    System.out.println(option);
                }

                // Input validation for answers
                try {
                    int answer = getAnswerFromUser();
                    if (answer == question.getCorrectOption()) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Wrong! The correct answer was option " + question.getCorrectOption());
                    }
                } catch (InvalidAnswerException e) {
                    System.out.println(e.getMessage()); // Handle invalid answer
                }
            }

            System.out.println("\nQuiz Finished! Your score: " + score);
        } catch (DatabaseException e) {
            System.out.println(e.getMessage()); // Handle database errors
        }
    }

    // Method to get a valid answer from the user
    private int getAnswerFromUser() throws InvalidAnswerException {
        System.out.print("Enter your answer (1-4): ");
        if (!scanner.hasNextInt()) {
            scanner.next(); // Clear the invalid input
            throw new InvalidAnswerException("Invalid input! Please enter a number between 1 and 4.");
        }
        int answer = scanner.nextInt();
        if (answer < 1 || answer > 4) {
            throw new InvalidAnswerException("Invalid answer! Please choose an option between 1 and 4.");
        }
        return answer;
    }
}
