// Custom exception for invalid email format
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

// Custom exception for invalid quiz answer
class InvalidAnswerException extends Exception {
    public InvalidAnswerException(String message) {
        super(message);
    }
}

// Custom exception for quiz database retrieval issues
class DatabaseException extends Exception {
    public DatabaseException(String message) {
        super(message);
    }
}
