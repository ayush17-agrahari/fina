<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Time's Up!</title>
    <link rel="stylesheet" href="styles.css" />
</head>
<body>
    <!-- Include Header -->
    <jsp:include page="header.jsp" />

    <div class="main-content">
        <h2>Time's Up!</h2>
        <p>Your quiz time has expired. Your results will be submitted automatically.</p>
        <p><a href="result.jsp">View Results</a></p>
    </div>

    <!-- Include Footer -->
    <jsp:include page="footer.jsp" />
</body>
</html>
