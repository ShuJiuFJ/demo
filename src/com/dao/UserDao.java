package com.dao;

import com.bean.User;
//import com.db.MySqlDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/myuser";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "123456";

    public List<User> queryUserList(String name, String sex, String birthday) {
        List<User> userList = new ArrayList<User>();
        Connection connection = null;
        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //PreparedStatement prst = null;
        PreparedStatement prst1 = null;
        PreparedStatement prst2 = null;
        PreparedStatement prst3 = null;
        String sql1=null;
        String sql2=null;
        String sql3=null;
        //String sql = "select * from myuser";
        //System.out.println(sql);
        if(name!=null){
        sql1 = "select * from myuser where name='" + name + "'";}
        //System.out.println(name);
        //System.out.println(sql1);
        if(sex!=null){
            sql2 = "select * from myuser where sex='" + sex + "'";
        }
        //System.out.println(sex);
        //System.out.println(sql2);
        if(birthday!=null){
            sql3 = "select * from myuser where birthday='" + birthday + "'";}
       // System.out.println(birthday);
        //System.out.println(sql3);
        try {
            //prst = connection.prepareStatement(sql);
            prst1 = connection.prepareStatement(sql1);
            prst2 = connection.prepareStatement(sql2);
            prst3 = connection.prepareStatement(sql3);
            //ResultSet rs = prst1.executeQuery();
            ResultSet rs1 = prst1.executeQuery();
            ResultSet rs2 = prst2.executeQuery();
            ResultSet rs3 = prst3.executeQuery();
            //System.out.println(rs + "测试Dao sql");
            while (rs1.next()) {
                User user = new User();
                userList.add(user);
                user.setName(rs1.getString("name"));
                user.setSex(rs1.getString("sex"));
                user.setBirthday(rs1.getString("birthday"));
                user.setPhone(rs1.getString("phone"));
                user.setJob(rs1.getString("job"));
                user.setRemake(rs1.getString("remake"));

            }
            while (rs1.next()) {
                User user = new User();
                userList.add(user);
                user.setName(rs3.getString("name"));
                user.setSex(rs3.getString("sex"));
                user.setBirthday(rs3.getString("birthday"));
                user.setPhone(rs3.getString("phone"));
                user.setJob(rs3.getString("job"));
                user.setRemake(rs3.getString("remake"));

            }
            while (rs2.next()) {
                User user = new User();
                userList.add(user);
                user.setName(rs2.getString("name"));
                user.setSex(rs2.getString("sex"));
                user.setBirthday(rs2.getString("birthday"));
                user.setPhone(rs2.getString("phone"));
                user.setJob(rs2.getString("job"));
                user.setRemake(rs2.getString("remake"));

            }
            //System.out.println("Dao层"+userList.get(1));
            rs1.close();
            prst1.close();
            rs3.close();
            prst3.close();
            rs2.close();
            prst2.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }
}
