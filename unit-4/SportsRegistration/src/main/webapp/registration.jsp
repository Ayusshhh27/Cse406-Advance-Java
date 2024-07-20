<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sports Registration</title>
</head>
<body>
    <h2>Sports Registration Form</h2>
    <form action="register" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="sports">Sport:</label>
        <select id="sports" name="sports" required>
            <option value="Football">Football</option>
            <option value="Basketball">Basketball</option>
            <option value="Cricket">Cricket</option>
            <option value="Tennis">Tennis</option>
        </select><br><br>

        <label for="gender">Gender:</label>
        <input type="radio" id="male" name="gender" value="Male" required>
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="Female" required>
        <label for="female">Female</label><br><br>

        <button type="submit">Register</button>
    </form>
</body>
</html>
