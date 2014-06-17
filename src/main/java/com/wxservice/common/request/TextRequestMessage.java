package com.wxservice.common.request;

public class TextRequestMessage extends WeChatBaseRequestMessage {
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        this.Content = content;
    }
}


