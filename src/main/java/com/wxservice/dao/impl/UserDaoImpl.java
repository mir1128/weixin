package com.wxservice.dao.impl;

import com.wxservice.dao.UserDAO;
import com.wxservice.model.User;

import javax.sql.DataSource;

public class UserDAOImpl implements UserDAO {
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insert(User user) {

    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public User findByInnerId(String innerId) {
        return null;
    }

    @Override
    public String findUserNameByInnerId(String innerId) {
        return null;
    }
}
