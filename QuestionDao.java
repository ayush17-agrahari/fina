import java.util.ArrayList;
import java.util.List;

// DAO Class for managing Question data
public class QuestionDao {
    private List<Question> questionBank;

    public QuestionDao() {
        // Initialize the in-memory question bank
        questionBank = new ArrayList<>();
        seedData(); // Populate with initial data
    }

    // Method to add a question
    public void addQuestion(Question question) {
        questionBank.add(question);
    }

    // Method to retrieve all questions
    public List<Question> getAllQuestions() {
        return new ArrayList<>(questionBank); // Return a copy to maintain immutability
    }

    // Seed initial data (mock database)
    private void seedData() {
        addQuestion(new Question(
                "What is the capital of France?",
                new String[]{"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
                3));
        addQuestion(new Question(
                "Which programming language is platform-independent?",
                new String[]{"1. Python", "2. Java", "3. C++", "4. JavaScript"},
                2));
        addQuestion(new Question(
                "What is 5 + 3?",
                new String[]{"1. 5", "2. 8", "3. 10", "4. 15"},
                2));
    }
}

