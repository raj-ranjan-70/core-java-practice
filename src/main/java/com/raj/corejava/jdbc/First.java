package com.raj.corejava.jdbc;

import java.sql.*;

public class First {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ums";
        String username = "root";
        String password = "root";
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Student");
        while(rs.next()) {
            System.out.println(rs.getString("student_name"));
        }

        con.close();
    }
}
