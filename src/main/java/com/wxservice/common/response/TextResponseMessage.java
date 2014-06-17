package com.wxservice.common.response;

public class TextResponseMessage extends WeChatBaseResponseMessage {
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        this.Content = content;
    }
}
