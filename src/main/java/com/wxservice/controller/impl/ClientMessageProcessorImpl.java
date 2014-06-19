package com.wxservice.controller.impl;

import com.wxservice.controller.ClientMessageProcessor;

public class ClientMessageProcessorImpl implements ClientMessageProcessor {
    private String BEGIN_WHEN_REPLY_DT = "回复dt开始答题";

    @Override
    public String processClientMessage(String content) {
        if (!content.equalsIgnoreCase("dt")){
            return BEGIN_WHEN_REPLY_DT;
        }


        return ".";
    }
}
