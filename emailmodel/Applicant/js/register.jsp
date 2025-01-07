<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration - Online Quiz</title>
    <link rel="stylesheet" href="styles.css" />
</head>
<body>
    <!-- Include Header -->
    <jsp:include page="header.jsp" />

    <div class="main-content">
        <h2>Register for Online Quiz</h2>
        <form action="registerUser" method="POST">
            <div class="form-group">
                <label for="username">Full Name:</label>
                <input type="text" id="username" name="username" required />
            </div>
            
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required />
            </div>

            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required />
            </div>

            <div class="form-group">
                <input type="submit" value="Register" />
            </div>
        </form>
    </div>

    <!-- Include Footer -->
    <jsp:include page="footer.jsp" />
</body>
</html>
