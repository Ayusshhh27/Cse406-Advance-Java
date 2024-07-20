/*
 * JDBC(Java Database Connectivity)is a Java API for connecting and interacting
 * with databases.JDBC drivers are software components that provide the
 * necessary functionality to connect Java applications to different types of
 * databases./*
 */

// There are four types of JDBC drivers:

// Type 1:JDBC-ODBC Bridge Driver

// Type 2:Native-API Partly Java Driver

// Type 3:Network Protocol Pure Java Driver

// Type 4:Thin Driver(also known as the Direct to Database Pure Java Driver)

// In addition to the JDBC drivers, there are several other components that
// make up the JDBC API, including:

// . DriverManager Class

// . Connection interface

// · Statement and PreparedStatement interfaces

// · ResultSet interface

// These components work together to provide a powerful and flexible API
// for working with databases in Java.

// package Demojdbc.src;

// import java.sql.*;
// import java.util.Scanner;

// //@SuppressWarnings("unused")
// public class Main {
// private static final String url = "jdbc:mysql://127.0.0.1:3306/mydb";
// private static final String username = "root";
// private static final String password = "ayush234";

// public static void main(String[] args) {
// try {
// Class.forName("com.mysql.cj.jdbc.Driver");
// } catch (ClassNotFoundException e) {
// e.printStackTrace();
// System.out.println(e.getMessage());
// }
// // * */
// CREATE----------------------------------------------------------------
// // try (Connection connection = DriverManager.getConnection(url, username,
// // password)) {
// // String insertQuery = "INSERT INTO students (name, age, marks) VALUES (?,
// // ?,?)";
// // try (PreparedStatement statement =
// connection.prepareStatement(insertQuery))
// // {
// // statement.setString(1, "John");
// // statement.setInt(2, 20);
// // statement.setDouble(3, 85.5);
// // int rowsInserted = statement.executeUpdate();
// // if (rowsInserted > 0) {
// // System.out.println("A new record was inserted successfully!");
// // } else {
// // System.out.println("Failed to insert a new record!");
// // }
// // }
// // } catch (SQLException e) {
// // System.out.println(e.getMessage());
// // }
// // * */ READ----------------------------------------------------------------
// // try (Connection connection = DriverManager.getConnection(url, username,
// // password);
// // Statement statement = connection.createStatement();
// // ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {
// // while (resultSet.next()) {
// // int id = resultSet.getInt("id");
// // String name = resultSet.getString("name");
// // int age = resultSet.getInt("age");
// // double marks = resultSet.getDouble("marks");
// // System.out.println("ID:" + id);
// // System.out.println("Name:" + name);
// // System.out.println("Age:" + age);
// // System.out.println("Marks:" + marks);
// // }
// // } catch (SQLException e) {
// // System.out.println(e.getMessage());
// // }
// // * */
// UPDATE----------------------------------------------------------------
// // try (Connection connection = DriverManager.getConnection(url, username,
// // password)) {
// // String updateQuery = "UPDATE students SET marks = ? WHERE name = ?";
// // try (PreparedStatement statement =
// connection.prepareStatement(updateQuery))
// // {
// // statement.setDouble(1, 90.0);
// // statement.setString(2, "John");
// // int rowsUpdated = statement.executeUpdate();
// // if (rowsUpdated > 0) {
// // System.out.println("Record updated successfully!");
// // } else {
// // System.out.println("Failed to update the record! No matching records
// // found.");
// // }
// // }
// // } catch (SQLException e) {
// // System.out.println(e.getMessage());
// // }
// // * */
// DELETE-----------------------------------------------------------------
// // try (Connection connection = DriverManager.getConnection(url, username,
// // password)) {
// // String deleteQuery = "DELETE FROM students WHERE name = ?";
// // try (PreparedStatement statement =
// connection.prepareStatement(deleteQuery))
// // {
// // statement.setString(1, "aman");
// // int rowsDeleted = statement.executeUpdate();
// // if (rowsDeleted > 0) {
// // System.out.println("Record deleted successfully!");
// // } else {
// // System.out.println("Failed to delete the record! No matching records
// // found.");
// // }
// // }
// // } catch (SQLException e) {
// // System.out.println(e.getMessage());
// // }
// // * */Batch
// Processing---------------------------------------------------------
// try (Connection connection = DriverManager.getConnection(url, username,
// password)) {
// String insertQuery = "INSERT INTO students (name, age, marks) VALUES (?,
// ?,?)";
// try (PreparedStatement statement = connection.prepareStatement(insertQuery))
// {
// @SuppressWarnings("resource")
// Scanner scanner = new Scanner(System.in);
// while (true) {
// System.out.println("Do you want to add more data? (yes/no): ");
// String choice = scanner.nextLine().toLowerCase();
// if (!choice.equals("yes")) {
// break;
// }
// // Get data from the user
// System.out.println("Enter name: ");
// String name = scanner.nextLine();
// System.out.println("Enter age: ");
// int age = Integer.parseInt(scanner.nextLine());
// System.out.println("Enter marks: ");
// double marks = Double.parseDouble(scanner.nextLine());
// // Set values for placeholders
// statement.setString(1, name);
// statement.setInt(2, age);
// statement.setDouble(3, marks);
// statement.addBatch();
// }
// int[] result = statement.executeBatch();
// for (int i : result) {
// System.out.println("Rows affected: " + i);
// }
// }
// } catch (SQLException e) {
// System.out.println(e.getMessage());
// }

// }
// }
