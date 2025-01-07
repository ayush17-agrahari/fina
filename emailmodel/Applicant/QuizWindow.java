import javax.swing.*;
import java.awt.*;

public class QuizWindow extends JFrame {
    
    public QuizWindow() {
        setTitle("Online Quiz");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Display a basic message for quiz start
        JLabel quizLabel = new JLabel("Welcome to the Online Quiz!", SwingConstants.CENTER);
        quizLabel.setFont(new Font("Arial", Font.BOLD, 20));
        
        add(quizLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuizWindow().setVisible(true);
            }
        });
    }
}
