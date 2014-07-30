package com.wxservice.model;

public class User {
    private String innerId;
    private String outterId;
    private String nickName;
    private String currentQuestionSet;
    private String questionSequence;
    private String answers;
    private int    finishIndex;

    public User(String innerId) {
        this.innerId = innerId;
    }

    public String getInnerId() {
        return innerId;
    }

    public String getOutterId() {
        return outterId;
    }

    public void setOutterId(String outterId) {
        this.outterId = outterId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCurrentQuestionSet() {
        return currentQuestionSet;
    }

    public void setCurrentQuestionSet(String currentQuestionSet) {
        this.currentQuestionSet = currentQuestionSet;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public int getFinishIndex() {
        return finishIndex;
    }

    public void setFinishIndex(int finishIndex) {
        this.finishIndex = finishIndex;
    }

    public String getQuestionSequence() {
        return questionSequence;
    }

    public void setQuestionSequence(String questionSequence) {
        this.questionSequence = questionSequence;
    }
}
