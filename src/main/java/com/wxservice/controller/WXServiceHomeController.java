package com.wxservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@Controller
@RequestMapping("/")
public class WXServiceHomeController {
    @RequestMapping(method = RequestMethod.GET)
    public void verifyEchoMessage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String verifyMessage = request.getParameter("echostr");
        if (verifyMessage != null){
            PrintWriter writer = response.getWriter().printf(verifyMessage);
            response.flushBuffer();
        }
    }
}


