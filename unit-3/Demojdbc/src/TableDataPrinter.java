package Demojdbc.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TableDataPrinter {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/mouse";
        String user = "root";
        String password = "ayush234";

        // Create a scanner to read the table name from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the table name: ");
        String tableName = scanner.nextLine();
        scanner.close();

        // Establish a database connection
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query to select all data from the specified table
            String query = "SELECT * FROM " + tableName;
            ResultSet resultSet = statement.executeQuery(query);

            // Get ResultSetMetaData to retrieve column information
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Print column names
            for (int i = 1; i <= columnCount; i++) {
                System.out.println(metaData.getColumnName(i) + "\t");
            }

            // Print rows of the table
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
