import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    // Simulating the quiz answer submission endpoint
    @PostMapping("/submit")
    public ResponseEntity<String> submitAnswer(@Valid @RequestBody QuizAnswerDTO quizAnswerDTO) {
        // If the data is valid, process the answer
        // (Here we just print it as an example)
        System.out.println("User ID: " + quizAnswerDTO.getUserId() + ", Answer: " + quizAnswerDTO.getAnswer());
        
        return ResponseEntity.ok("Answer submitted successfully.");
    }
}
//The QuizAnswerDTO class is validated with annotations like @NotNull, @Min, and @Max to ensure the user's answer is within
 //the expected range (1-4).