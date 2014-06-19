package com.wxservice.dao.impl;

import com.wxservice.dao.AnswerDAO;
import com.wxservice.model.Answers;


import javax.sql.DataSource;
import java.util.List;

public class AnswerDAOImpl implements AnswerDAO {
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insert(Answers answers) {

    }

    @Override
    public List<Answers> findAnswerSets(String innerId) {
        return null;
    }
}
