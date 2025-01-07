public class EmailSender {
    public static void send(String email, String verificationCode) {
        // Simulate email sending
        System.out.println("Verification code [" + verificationCode + "] sent to " + email);

        // Real implementation:
        // - Integrate with an email-sending API (e.g., JavaMail, SendGrid, AWS SES)
        // - Secure SMTP configuration
    }
}

