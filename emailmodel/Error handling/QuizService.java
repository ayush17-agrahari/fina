import java.util.ArrayList;
import java.util.List;

// QuizService handles the core logic of the quiz application
public class QuizService {
    // Method to fetch questions from the "database" (simulated here)
    public List<Question> getQuestions() throws DatabaseException {
        List<Question> questions = new ArrayList<>();
        try {
            // Simulating loading questions from a database
            questions.add(new Question("What is the capital of France?", 
                new String[]{"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"}, 3));
            questions.add(new Question("Which language is platform-independent?", 
                new String[]{"1. Python", "2. Java", "3. C++", "4. JavaScript"}, 2));
            questions.add(new Question("What is 10 + 5?", 
                new String[]{"1. 5", "2. 8", "3. 15", "4. 10"}, 3));
        } catch (Exception e) {
            throw new DatabaseException("Failed to load questions from the database.");
        }
        return questions;
    }
}
