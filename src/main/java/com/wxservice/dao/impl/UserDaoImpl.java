package com.wxservice.dao.impl;

import com.wxservice.dao.UserDAO;
import com.wxservice.model.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(User user) {
        String sql = "insert into user (user_inner_id, user_outter_id, username, currentQuestionSet," +
                "questionSequence, answers, finish_index) values (?,?,?,?,?,?,?)";

        Connection connection = null;
        try {
            connection = getDataSource().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getInnerId());
            preparedStatement.setString(2, user.getOutterId());
            preparedStatement.setString(3, user.getNickName());
            preparedStatement.setString(4, user.getCurrentQuestionSet());
            preparedStatement.setString(5, user.getQuestionSequence());
            preparedStatement.setString(6, user.getAnswers());
            preparedStatement.setInt(7, user.getFinishIndex());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public User findByInnerId(String innerId) {
        String sql = "select * from user where user_inner_id = ?";

        Connection connection = null;
        try {
            connection = getDataSource().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            preparedStatement.setString(1, innerId);
            User user = null;
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                user = new User(innerId);
                user.setOutterId(resultSet.getString("user_outter_id"));
                user.setNickName(resultSet.getString("username"));
                user.setCurrentQuestionSet(resultSet.getString("currentQuestionSet"));
                user.setQuestionSequence(resultSet.getString("questionSequence"));
                user.setAnswers(resultSet.getString("answers"));
                user.setFinishIndex(resultSet.getInt("finish_index"));
            }

            resultSet.close();
            preparedStatement.close();
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}

