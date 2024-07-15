package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to check if a number is even
    public static boolean even(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        // Test add and even methods
        System.out.println("4 + 5 = " + add(4, 5));
        System.out.println("4 is even: " + even(4));

        // Database connection logic
        try {
            // Create the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "1826");
            // prepare a statement
            Statement st = con.createStatement();

            // Execute query
            ResultSet rs = st.executeQuery("select * from jdbc;");

            // Print results
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " 
                    + rs.getString(2) + ", " + rs.getString(3));
            }

            // Close resources
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
