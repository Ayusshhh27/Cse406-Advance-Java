package Demojdbc.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateCGPA {

    private static final String URL = "jdbc:mysql://localhost:3306/mouse";
    private static final String USER = "root";
    private static final String PASSWORD = "ayush234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;

        try {
            // Establish connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String registrationNumber;
            float newCgpa;

            while (true) {
                // Read registration number and CGPA
                System.out.print("Enter registration number: ");
                registrationNumber = scanner.nextLine();
                System.out.print("Enter new CGPA: ");
                newCgpa = scanner.nextFloat();
                scanner.nextLine(); // Consume the newline

                // Check if registration number exists
                if (registrationNumberExists(connection, registrationNumber)) {
                    // Update CGPA
                    updateCgpa(connection, registrationNumber, newCgpa);
                    System.out.println("CGPA updated successfully.");
                    break;
                } else {
                    System.out.println("Registration number not found. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            scanner.close();
        }
    }

    private static boolean registrationNumberExists(Connection connection, String registrationNumber)
            throws SQLException {
        String query = "SELECT COUNT(*) FROM student WHERE registration_number = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, registrationNumber);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt(1) > 0;
                }
            }
        }
        return false;
    }

    private static void updateCgpa(Connection connection, String registrationNumber, float newCgpa)
            throws SQLException {
        String updateQuery = "UPDATE student SET cgpa = ? WHERE registration_number = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setFloat(1, newCgpa);
            preparedStatement.setString(2, registrationNumber);
            preparedStatement.executeUpdate();
        }
    }
}
