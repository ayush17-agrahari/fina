import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnlineQuizApp extends JFrame {
    private static final String[][] QUESTIONS = {
        {"What is the capital of France?", "Berlin", "Paris", "Rome", "Madrid", "Paris", "Paris is the capital of France."},
        {"Who wrote 'Romeo and Juliet'?", "Shakespeare", "Dickens", "Hemingway", "Austen", "Shakespeare", "Shakespeare wrote 'Romeo and Juliet'."},
        {"What is 2 + 2?", "3", "4", "5", "6", "4", "2 + 2 equals 4."},
        {"What is the largest ocean on Earth?", "Atlantic", "Indian", "Pacific", "Arctic", "Pacific", "The Pacific Ocean is the largest."},
        {"Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", "Mars", "Mars is known as the Red Planet."},
        {"Who painted the Mona Lisa?", "Van Gogh", "Da Vinci", "Picasso", "Monet", "Da Vinci", "Da Vinci painted the Mona Lisa."},
        {"Which element has the chemical symbol 'O'?", "Oxygen", "Osmium", "Ozone", "Opium", "Oxygen", "The chemical symbol 'O' represents Oxygen."},
        {"What is the boiling point of water?", "90°C", "100°C", "110°C", "120°C", "100°C", "Water boils at 100°C at standard pressure."},
        {"Which country is the Eiffel Tower located in?", "Germany", "France", "Italy", "Spain", "France", "The Eiffel Tower is in France."},
        {"Who discovered gravity?", "Einstein", "Newton", "Galileo", "Tesla", "Newton", "Isaac Newton discovered gravity."}
    };

    private JLabel questionLabel;
    private JRadioButton option1, option2, option3, option4;
    private ButtonGroup optionsGroup;
    private JButton submitButton;
    private int currentQuestionIndex = 0;
    private int score = 0;
    private StringBuilder feedback = new StringBuilder();

    public OnlineQuizApp() {
        setTitle("Online Quiz");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create components for quiz questions
        questionLabel = new JLabel("", SwingConstants.CENTER);
        add(questionLabel, BorderLayout.NORTH);

        JPanel quizPanel = new JPanel();
        quizPanel.setLayout(new BoxLayout(quizPanel, BoxLayout.Y_AXIS));

        option1 = new JRadioButton();
        option2 = new JRadioButton();
        option3 = new JRadioButton();
        option4 = new JRadioButton();

        optionsGroup = new ButtonGroup();
        optionsGroup.add(option1);
        optionsGroup.add(option2);
        optionsGroup.add(option3);
        optionsGroup.add(option4);

        quizPanel.add(option1);
        quizPanel.add(option2);
        quizPanel.add(option3);
        quizPanel.add(option4);

        submitButton = new JButton("Next Question");
        quizPanel.add(submitButton);

        add(quizPanel, BorderLayout.CENTER);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
                currentQuestionIndex++;
                if (currentQuestionIndex < QUESTIONS.length) {
                    displayQuestion();
                } else {
                    showResults();
                }
            }
        });

        displayQuestion();
    }

    private void displayQuestion() {
        // Set question and options based on the current index
        String[] currentQuestion = QUESTIONS[currentQuestionIndex];
        questionLabel.setText(currentQuestion[0]);
        option1.setText(currentQuestion[1]);
        option2.setText(currentQuestion[2]);
        option3.setText(currentQuestion[3]);
        option4.setText(currentQuestion[4]);
    }

    private void checkAnswer() {
        String[] currentQuestion = QUESTIONS[currentQuestionIndex];
        String correctAnswer = currentQuestion[5];
        String explanation = currentQuestion[6];

        // Check which option is selected
        String selectedAnswer = "";
        if (option1.isSelected()) selectedAnswer = option1.getText();
        if (option2.isSelected()) selectedAnswer = option2.getText();
        if (option3.isSelected()) selectedAnswer = option3.getText();
        if (option4.isSelected()) selectedAnswer = option4.getText();

        if (selectedAnswer.equals(correctAnswer)) {
            feedback.append("Question ").append(currentQuestionIndex + 1).append(": Correct!\n\n");
            score++;
        } else {
            feedback.append("Question ").append(currentQuestionIndex + 1).append(": Incorrect. The correct answer is '")
                    .append(correctAnswer).append("'. ").append(explanation).append("\n\n");
        }
    }

    private void showResults() {
        String resultMessage = "Quiz Over! Your score: " + score + "/" + QUESTIONS.length + "\n\n" + feedback.toString();
        JOptionPane.showMessageDialog(this, resultMessage, "Quiz Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OnlineQuizApp().setVisible(true);
            }
        });
    }
}
