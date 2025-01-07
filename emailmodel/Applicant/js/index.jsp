<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Quiz</title>
    <link rel="stylesheet" href="styles.css" />
</head>
<body>
    <h2>Welcome to the Online Quiz!</h2>
    <form action="quizResult" method="POST">
        <h3>Question 1: What is the capital of France?</h3>
        <input type="radio" name="q1" value="1" /> Berlin<br>
        <input type="radio" name="q1" value="2" /> Madrid<br>
        <input type="radio" name="q1" value="3" /> Paris<br>
        <input type="radio" name="q1" value="4" /> Rome<br>

        <h3>Question 2: Which language is used for Android development?</h3>
        <input type="radio" name="q2" value="1" /> Java<br>
        <input type="radio" name="q2" value="2" /> C++<br>
        <input type="radio" name="q2" value="3" /> Python<br>
        <input type="radio" name="q2" value="4" /> Ruby<br>

        <input type="submit" value="Submit Quiz" />
    </form>
</body>
</html>
