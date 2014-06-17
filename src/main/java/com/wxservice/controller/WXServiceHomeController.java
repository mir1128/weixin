package com.wxservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.Principal;


@Controller
@RequestMapping("/")
public class WXServiceHomeController {
    @Resource(name="coreService")
    private CoreService coreService;

    @RequestMapping(method = RequestMethod.GET)
    public void get(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String verifyMessage = request.getParameter("echostr");
        if (verifyMessage != null){
            PrintWriter writer = response.getWriter().printf(verifyMessage);
            response.flushBuffer();
        }
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "text/xml")
    public  void post(HttpServletRequest request, HttpServletResponse response)  {
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        response.setCharacterEncoding("UTF-8");

        String respMessage = coreService.processRequest(request);

        System.out.println("response message is " + respMessage);
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.print(respMessage);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
            out = null;
        }
    }

    @RequestMapping(value ="/welcome", method = RequestMethod.GET)
    public String printWelcome(ModelMap model, Principal principal) {
        model.addAttribute("message", "Spring Security Hello World");
        model.addAttribute("username", principal.getName());
        return "home";
    }
}


