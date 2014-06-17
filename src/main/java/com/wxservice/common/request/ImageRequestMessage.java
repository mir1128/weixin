package com.wxservice.common.request;

public class ImageRequestMessage extends WeChatBaseRequestMessage {

    private String picUrl;

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
