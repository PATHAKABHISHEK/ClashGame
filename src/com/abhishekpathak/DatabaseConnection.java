package com.abhishekpathak;

import java.sql.*;
public class DatabaseConnection {
    Statement stmt;
    ResultSet rs;
    String high_score;
    DatabaseConnection() {
        try {
            // Registering Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");

             stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from player");

        } catch (Exception e) {

            System.out.println("Exception arises in database connection class " + e.getMessage());

        }
    }

    public void loopdatabse(String name, String age) throws SQLException {
        while(rs.next()){
            if(name == rs.getString(1) && age == rs.getString(2)){
               high_score = rs.getString(3);
            }

        }
    }
}