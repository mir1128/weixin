package com.wxservice.dao;

import com.wxservice.model.User;

public interface UserDAO {
    public  void     insert(User user);
    public  User     findByInnerId(String innerId);
}
