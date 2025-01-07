import java.util.ArrayList;
import java.util.Scanner;

public class OnlineQuizApp {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question(
                "What is the capital of France?",
                new String[]{"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
                3));
        quiz.addQuestion(new Question(
                "Which programming language is platform-independent?",
                new String[]{"1. Python", "2. Java", "3. C++", "4. JavaScript"},
                2));
        quiz.addQuestion(new Question(
                "What is 5 + 3?",
                new String[]{"1. 5", "2. 8", "3. 10", "4. 15"},
                2));
        
        quiz.start();
    }
}

// Class representing a single question
class Question {
    private String questionText;
    private String[] options;
    private int correctOption;

    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}

// Class representing the quiz
class Quiz {
    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Online Quiz!");
            System.out.println("Answer the questions by entering the corresponding option number.");
            System.out.println("-------------------------------------------------------------");

            for (int i = 0; i < questions.size(); i++) {
                Question question = questions.get(i);
                System.out.println("Question " + (i + 1) + ": " + question.getQuestionText());
                for (String option : question.getOptions()) {
                    System.out.println(option);
                }

                int userAnswer = getUserAnswer(scanner);
                if (userAnswer == question.getCorrectOption()) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The correct answer was: " + question.getCorrectOption());
                }
                System.out.println("-------------------------------------------------------------");
            }

            System.out.println("Quiz Finished!");
            System.out.println("Your total score: " + score + " / " + questions.size());
        }
    }

    private int getUserAnswer(Scanner scanner) {
        int userAnswer = -1;
        while (true) {
            System.out.print("Your answer: ");
            if (scanner.hasNextInt()) {
                userAnswer = scanner.nextInt();
                if (userAnswer >= 1 && userAnswer <= 4) {
                    break;
                } else {
                    System.out.println("Please enter a valid option (1-4).");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
        return userAnswer;
    }
}
