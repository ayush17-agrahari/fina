<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quiz Results</title>
    <link rel="stylesheet" href="styles.css" />
</head>
<body>
    <h2>Your Quiz Results</h2>
    <p>Your score: <%= request.getAttribute("score") %> / 2</p>
    <p><a href="index.jsp">Take the Quiz Again</a></p>
</body>
</html>
