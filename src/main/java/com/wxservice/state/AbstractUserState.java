package com.wxservice.state;

public abstract class AbstractUserState implements UserState{
    private UserContext userContext;

    protected AbstractUserState(UserContext userContext) {
        this.userContext = userContext;
    }
}
