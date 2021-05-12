package com.mycompany.app;



import java.sql.*;

public class App {

    public static void main( String[] args ) throws SQLException {
        //create connection for a server installed in localhost, with a user "root" with no password
        System.out.println("it should be print here");
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://23.254.161.132:3306/main_db?user=dan&password=123456")) {
            // create a Statement
            try (Statement stmt = conn.createStatement()) {
                //execute query
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM t")) {
                    //position result to first
                    while (rs.next()){
                        System.out.println(rs.getString(1));
                        System.out.println(rs.getString(2));
                        System.out.println(rs.getString(3));
                    }
                }
            }
        }
    }
}