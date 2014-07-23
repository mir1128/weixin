package com.wxservice.controller.impl;

import com.wxservice.ItemPool.Item;
import com.wxservice.ItemPool.ItemsService;
import com.wxservice.controller.ClientMessageProcessor;
import com.wxservice.controller.CoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service("clientMessageProcessor")
public class ClientMessageProcessorImpl implements ClientMessageProcessor {
    private String BEGIN_WHEN_REPLY_DT = "回复dt开始答题";

    @Resource(name="itemsService")
    private ItemsService itemsService;

    static private Map<String, Integer> userStatus = new HashMap<String, Integer>();

    @Override
    public String processClientMessage(String content, String userInnerId) {
        return null;
    }
}
