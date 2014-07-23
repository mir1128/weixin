package com.wxservice.state;

public interface UserState {
    String replyToUser(String userInputMessage);
    void   changeState(UserState nextState);
}
