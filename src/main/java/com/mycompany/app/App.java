package com.mycompany.app;



import java.sql.*;

public class App {

    public static void main( String[] args ) throws SQLException {
        Userprofile user;
        urlprofile url = new urlprofile();

        //create connection for a server installed in localhost, with a user "root" with no password
        System.out.println("it should be print here");
        try (Connection conn = DriverManager.getConnection(url.getUrl());
            Statement statement = conn.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS contacts(name TEXT, phone INTEGER, email TEXT, address TEXT)");
            // create a Statement

            statement.execute("INSERT INTO contacts (name, phone, email, address)" + "VALUES('TRUMP', 123456,'Trump@pots.com','white house')");
            statement.close();
            conn.close();

        } catch (SQLException e){
            System.out.println(" Something wrong");
        }
    }
}