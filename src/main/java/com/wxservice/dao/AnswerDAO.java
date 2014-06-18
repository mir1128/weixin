package com.wxservice.dao;

import com.wxservice.model.Answers;

import java.util.List;

public interface AnswerDAO {
    public  void                insert(Answers answers);
    public  List<Answers>       findAnswerSets(String innerId);
}
