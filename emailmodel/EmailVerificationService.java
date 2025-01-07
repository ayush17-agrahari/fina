import java.util.Scanner;

public class EmailVerificationService {
    public void verifyEmail() {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get email input
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        // Step 2: Validate email format
        if (!EmailValidator.isValid(email)) {
            System.out.println("Invalid email format. Please try again.");
            return;
        }

        System.out.println("Email format is valid!");

        // Step 3: Generate and send verification code
        String verificationCode = VerificationCodeGenerator.generateCode();
        EmailSender.send(email, verificationCode);

        // Step 4: Verify the code entered by the user
        System.out.print("Enter the verification code sent to your email: ");
        String userCode = scanner.nextLine();

        if (verificationCode.equals(userCode)) {
            System.out.println("Email verified successfully!");
        } else {
            System.out.println("Verification failed. Incorrect code.");
        }

        scanner.close();
    }
}

