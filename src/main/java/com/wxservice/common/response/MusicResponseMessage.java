package com.wxservice.common.response;

public class MusicResponseMessage extends WeChatBaseResponseMessage {
    private Music Music;

    public Music getMusic() {
        return Music;
    }

    public void setMusic(Music music) {
        this.Music = music;
    }
}
