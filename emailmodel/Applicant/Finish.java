import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finish extends JFrame {
    private int score;
    private int totalQuestions;

    public Finish(int score, int totalQuestions) {
        this.score = score;
        this.totalQuestions = totalQuestions;

        // Frame setup
        setTitle("Quiz Finished");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JLabel resultLabel = new JLabel("Quiz Finished! Your score: " + score + " / " + totalQuestions, SwingConstants.CENTER);
        resultLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));

        JButton restartButton = new JButton("Take Quiz Again");
        JButton exitButton = new JButton("Exit");

        // Add components to frame
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(resultLabel);
        add(restartButton);
        add(exitButton);

        // Button actions
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Restart the quiz (reset score and current question)
                new QuizWindow().setVisible(true);
                dispose(); // Close the Finish window
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exit the application
                System.exit(0);
            }
        });
    }

    public static void showFinishScreen(int score, int totalQuestions) {
        // Create and display the Finish screen
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Finish(score, totalQuestions).setVisible(true);
            }
        });
    }
}
