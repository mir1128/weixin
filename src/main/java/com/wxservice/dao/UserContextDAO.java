package com.wxservice.dao;

import com.wxservice.state.UserContext;

public interface UserContextDAO {
    UserContext findByID(String id);
    void insert(UserContext userContext);
}
