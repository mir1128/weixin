package com.wxservice.controller;

import com.wxservice.ItemPool.ItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/reload")
public class QuestionLoaderController {

    @Resource(name="itemsService")
    private ItemsService itemsService;

    @RequestMapping(method = RequestMethod.GET)
    public void get(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        try {
            itemsService.loadItems();
            writer.printf("reload success.");
        }catch (IOException e){
            writer.printf("reload failed");
        }
        response.flushBuffer();
    }
}

