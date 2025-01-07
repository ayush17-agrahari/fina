import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton registerButton;
    private JLabel statusLabel;

    // In-memory storage for registered users
    private static final java.util.Map<String, String> users = new java.util.HashMap<>();

    public RegistrationForm() {
        // Frame settings
        setTitle("Online Quiz Registration");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2));

        // Create components
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        
        registerButton = new JButton("Register");
        statusLabel = new JLabel("");
        statusLabel.setForeground(Color.RED);

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(new JLabel(""));  // Empty cell
        add(registerButton);
        add(statusLabel);

        // Add action listener for the register button
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleRegistration();
            }
        });
    }

    // Handle registration logic
    private void handleRegistration() {
        String username = usernameField.getText();
        char[] password = passwordField.getPassword();
        char[] confirmPassword = confirmPasswordField.getPassword();

        // Validate input
        if (username.isEmpty() || password.length == 0 || confirmPassword.length == 0) {
            statusLabel.setText("All fields are required.");
            return;
        }

        // Check if passwords match
        if (!new String(password).equals(new String(confirmPassword))) {
            statusLabel.setText("Passwords do not match.");
            return;
        }

        // Check if username already exists
        if (users.containsKey(username)) {
            statusLabel.setText("Username already exists.");
            return;
        }

        // Save user to "database" (in-memory)
        users.put(username, new String(password));

        // Registration success message
        statusLabel.setText("Registration successful!");
        statusLabel.setForeground(Color.GREEN);

        // Transition to login form or main menu (Optional)
        new LoginForm().setVisible(true);
        dispose();  // Close the registration window
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }
}
