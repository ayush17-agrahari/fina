import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestionRepository {
    private final List<Question> questionBank = new ArrayList<>();

    public QuestionRepository() {
        seedData();
    }

    public List<Question> getAllQuestions() {
        return new ArrayList<>(questionBank);
    }

    private void seedData() {
        questionBank.add(new Question(
                "What is the capital of France?",
                new String[]{"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
                3));
        questionBank.add(new Question(
                "Which programming language is platform-independent?",
                new String[]{"1. Python", "2. Java", "3. C++", "4. JavaScript"},
                2));
        questionBank.add(new Question(
                "What is 5 + 3?",
                new String[]{"1. 5", "2. 8", "3. 10", "4. 15"},
                2));
    }
}
