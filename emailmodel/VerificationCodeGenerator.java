public class VerificationCodeGenerator {
    public static String generateCode() {
        int code = (int) (Math.random() * 900000) + 100000; // Generates a number between 100000 and 999999
        return String.valueOf(code);
    }
}

