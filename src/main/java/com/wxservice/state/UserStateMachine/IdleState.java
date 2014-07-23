package com.wxservice.state.UserStateMachine;

import com.wxservice.state.AbstractUserState;
import com.wxservice.state.UserContext;
import com.wxservice.state.UserState;

public class IdleState extends AbstractUserState {
    protected IdleState(UserContext userContext) {
        super(userContext);
    }

    @Override
    public String replyToUser(String userInputMessage) {
        return null;
    }

    @Override
    public void changeState(UserState nextState) {

    }
}
