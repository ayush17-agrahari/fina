import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailVerification {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        // Step 1: Validate the email format
        if (!isValidEmail(email)) {
            System.out.println("Invalid email format. Please try again.");
            return;
        }

        System.out.println("Email format is valid!");

        // Step 2: Generate and send a verification code
        String verificationCode = generateVerificationCode();
        System.out.println("Sending verification code to your email...");

        // Simulating email sending
        sendVerificationCode(email, verificationCode);

        // Step 3: Verify the code entered by the user
        System.out.print("Enter the verification code sent to your email: ");
        String userCode = scanner.nextLine();

        if (verificationCode.equals(userCode)) {
            System.out.println("Email verified successfully!");
        } else {
            System.out.println("Verification failed. Incorrect code.");
        }

        scanner.close();
    }

    // Validate email format using a regular expression
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    // Generate a random 6-digit verification code
    public static String generateVerificationCode() {
        int code = (int) (Math.random() * 900000) + 100000; // Generates a number between 100000 and 999999
        return String.valueOf(code);
    }

    // Simulate sending the verification code (placeholder for email service)
    public static void sendVerificationCode(String email, String verificationCode) {
        System.out.println("Verification code [" + verificationCode + "] sent to " + email);
        // In a real application, use an email service to send the code.
    }
}
