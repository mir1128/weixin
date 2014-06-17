package com.wxservice.common.request;

public class VoiceRequestMessage extends WeChatBaseRequestMessage {
    private String MediaId;
    private String Format;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        this.MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        this.Format = format;
    }
}
