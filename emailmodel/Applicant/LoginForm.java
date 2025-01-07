import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel errorLabel;

    // Hardcoded username and password for simplicity
    private static final String VALID_USERNAME = "user";
    private static final String VALID_PASSWORD = "password123";

    public LoginForm() {
        // Frame settings
        setTitle("Online Quiz Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        // Create components
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        errorLabel = new JLabel("");
        errorLabel.setForeground(Color.RED);

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel(""));  // Empty cell
        add(loginButton);
        add(errorLabel);

        // Add action listener for login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });
    }

    // Handle login validation
    private void handleLogin() {
        String username = usernameField.getText();
        char[] password = passwordField.getPassword();

        if (username.equals(VALID_USERNAME) && new String(password).equals(VALID_PASSWORD)) {
            errorLabel.setText("Login successful!");
            errorLabel.setForeground(Color.GREEN);
            // Transition to the quiz screen after successful login
            new QuizWindow().setVisible(true);
            dispose();  // Close login window
        } else {
            errorLabel.setText("Invalid username or password.");
            errorLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}
