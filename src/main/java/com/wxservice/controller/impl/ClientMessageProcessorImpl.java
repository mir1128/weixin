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
        if (!content.equalsIgnoreCase("dt")){
            return BEGIN_WHEN_REPLY_DT;
        }
        else {
            Map<Integer, Item> questionsSet = itemsService.getQuestionSet();
            if (userStatus.containsKey(userInnerId)){
                int index = userStatus.get(userInnerId);
                if (questionsSet.containsKey(index)){
                    userStatus.put(userInnerId, index+1);
                    return questionsSet.get(++index).getQuestion();
                }
                else {
                    return questionsSet.get(0).getQuestion();
                }
            }
            else {
                return questionsSet.get(0).getQuestion();
            }
        }
    }
}
