package com.wxservice.controller;

import com.wxservice.dao.UserDAO;
import com.wxservice.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @RequestMapping(method = RequestMethod.GET)
    public String showRegisterPage() {
        return "register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String register(ModelMap model, @RequestParam("username") String userName, @RequestParam("password") String password) {
        System.out.println("User name: " + userName);
        System.out.println("Password: " + password);
        UserDAO userDAO = new UserDAO();
        User user = new User(userName, password);

        userDAO.save(user);

        model.addAttribute("message", "Spring Security Hello World");
        model.addAttribute("username", user.getUserName());

        return "home";
    }
}