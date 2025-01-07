# Online Quiz Application in Java

This is a simple Java-based online quiz application that allows users to answer a series of multiple-choice questions, view feedback on their answers, and get an explanation for the correct answer if they provide an incorrect one. The application also offers a score evaluation at the end of the quiz.

## Features
- **10 Multiple Choice Questions**: The quiz consists of 10 questions on various topics.
- **Answer Feedback**: After each question, users will receive feedback on whether their answer was correct or incorrect.
- **Correct Answer with Explanation**: If the user selects the wrong answer, the application will provide the correct answer along with a brief explanation.
- **Score Evaluation**: After completing the quiz, the user will receive their total score (out of 10) along with detailed feedback for each question.

## Prerequisites

Before running the quiz application, ensure you have the following:
- **Java Development Kit (JDK)** installed on your machine (version 8 or higher).
- A **text editor** or **IDE** (such as IntelliJ IDEA, Eclipse, or Visual Studio Code) to edit the code.
- Basic understanding of how to compile and run Java programs.

## Setup and Installation

1. **Clone or Download the Repository**:
   - Clone the repository or download the Java file (`OnlineQuizApp.java`) to your local machine.


2. **Create a New Java Project**:
- Open your Java IDE or text editor and create a new Java project.
- Add the `OnlineQuizApp.java` file to your project.

3. **Add the Image** (Optional):
- If you want to display an image of the student (e.g., a picture of a student taking the quiz), place the image file (e.g., `student.jpg`) in the same directory as your `OnlineQuizApp.java` file.

4. **Compile the Java Code**:
- In your IDE, click on the **Compile** button or run the following command in the terminal:


5. **Run the Java Program**:
- After compiling the code, run the application using your IDE or by executing the following command in the terminal:


## How to Use

1. **Start the Quiz**: 
- Once the application is launched, you will see the first question along with four answer choices.
- Click on one of the options to select your answer.

2. **Move to Next Question**:
- After selecting an answer, click the "Next Question" button to move to the next question.
- The quiz will automatically check your answer and display feedback (whether your answer was correct or not).

3. **View Results**:
- After completing all 10 questions, the application will display your total score and provide a detailed report of your answers, including whether each answer was correct or incorrect along with explanations.

## Example Questions

- **Question 1**: What is the capital of France?
- A) Berlin
- B) Paris
- C) Rome
- D) Madrid

**Correct Answer**: B) Paris
**Explanation**: Paris is the capital of France.

- **Question 2**: Who wrote 'Romeo and Juliet'?
- A) Shakespeare
- B) Dickens
- C) Hemingway
- D) Austen

**Correct Answer**: A) Shakespeare
**Explanation**: William Shakespeare is famous for writing the play 'Romeo and Juliet'.

## File Structure


## Troubleshooting

- **Image Not Displaying**: If the student image is not displaying, make sure that the image file (e.g., `student.jpg`) is located in the same directory as `OnlineQuizApp.java` and that the file path is correctly referenced.
  
- **Error: NoClassDefFoundError**: Ensure you have compiled the Java code using the correct version of JDK (Java 8 or higher).

## License

This project is open-source and available under the [MIT License](LICENSE).

## Contributing

If you have suggestions or improvements for this quiz application, feel free to fork this repository, make changes, and submit a pull request. Any contributions to improve the quiz are welcome!

## Acknowledgments

- The application uses **Java Swing** to build the user interface.
- The quiz questions and explanations are hardcoded in the `QUESTIONS` array, and can be easily modified to add more questions or change existing ones.

---

Thank you for using the **Online Quiz Application**! We hope this quiz helps you in your self-assessment and knowledge evaluation.
