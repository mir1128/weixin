package com.wxservice.state;

import com.wxservice.dao.UserContextDAO;
import com.wxservice.dao.impl.UserContextDAOImpl;

public class UserContextFactory {
    static UserContext createUserContext(String userInnerID){
        UserContextDAO userContextDAO = new UserContextDAOImpl();
        return userContextDAO.findByID(userInnerID);
    }
}
