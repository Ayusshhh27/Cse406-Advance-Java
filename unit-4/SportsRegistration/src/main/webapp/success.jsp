<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Successful</title>
</head>
<body>
    <h2>Registration Successful!</h2>
    <p>Thank you for registering, <%= request.getAttribute("name") %>!</p>
    <p>Your Registration ID: <%= request.getAttribute("regId") %></p>
    <p>Date and Time: <%= new Date() %></p>
</body>
</html>
