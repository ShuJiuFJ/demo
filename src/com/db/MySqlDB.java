//package com.db;
//
//import java.sql.*;
//
//public class MySqlDB {
//    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
//    private static final String URL = "jdbc:mysql://localhost:3306/myuser";
//    private static final String USER_NAME = "root";
//    private static final String PASSWORD = "123456";
//
//    public Connection getConnection() {
//        Connection connection = null;
//        try {
//            Class.forName(DRIVER_NAME);
//            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return connection;
//    }
//
//
//}
//
