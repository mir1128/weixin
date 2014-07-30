package com.wxservice.state;


import com.wxservice.dao.UserDAO;
import com.wxservice.dao.impl.UserDAOImpl;
import com.wxservice.model.User;

public class UserContextFactory {
    static UserContext createUserContext(String userInnerID){

        UserDAO userDAO = new UserDAOImpl();
        User user =  userDAO.findByInnerId(userInnerID);

        return  new UserContext();
    }
}
