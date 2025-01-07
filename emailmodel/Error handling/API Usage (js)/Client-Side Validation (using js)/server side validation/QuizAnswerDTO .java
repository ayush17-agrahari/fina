import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class QuizAnswerDTO {

    @NotNull(message = "Answer cannot be null")
    @Min(value = 1, message = "Answer must be between 1 and 4")
    @Max(value = 4, message = "Answer must be between 1 and 4")
    private Integer answer;

    @NotNull(message = "User ID cannot be null")
    private Integer userId;

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
