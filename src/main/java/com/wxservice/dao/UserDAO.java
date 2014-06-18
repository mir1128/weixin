package com.wxservice.dao;

import com.wxservice.model.User;

public interface UserDAO {
    public  void     insert(User user);
    public  User     findById(String id);
    public  User     findByInnerId(String innerId);
    public  String   findUserNameByInnerId(String innerId);
}
