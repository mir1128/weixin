package com.wxservice.dao;

import com.wxservice.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class UserDAO {
    public User save(User user){
        Connection connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/weixin?user=root");
            PreparedStatement preparedSaveUserStatement = connect.prepareStatement("insert into users values (?, ?, ?, ?)");

            String userId = UUID.randomUUID().toString();

            preparedSaveUserStatement.setString(1, userId);
            preparedSaveUserStatement.setString(2, user.getUserName());
            preparedSaveUserStatement.setString(3, user.getPassword());
            preparedSaveUserStatement.setBoolean(4, true);
            preparedSaveUserStatement.execute();

            PreparedStatement preparedSaveUserRoleStmt = connect.prepareStatement("INSERT INTO user_roles VALUES (default, ?, ?)");
            preparedSaveUserRoleStmt.setString(1, userId);
            preparedSaveUserRoleStmt.setString(2, "ROLE_USER");
            preparedSaveUserRoleStmt.execute();
            connect.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(connect!=null)
                try {
                    connect.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return user;
    }
}
