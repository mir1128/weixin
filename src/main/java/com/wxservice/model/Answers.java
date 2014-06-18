package com.wxservice.model;

public class Answers {
    private String innerId;
    private String questionSetName;
    private String questionAnswers;
    private long   timeConsuming;

    public Answers(String innerId, String questionSetName, String questionAnswers, long timeConsuming) {
        this.innerId = innerId;
        this.questionSetName = questionSetName;
        this.questionAnswers = questionAnswers;
        this.timeConsuming = timeConsuming;
    }

    public String getInnerId() {
        return innerId;
    }

    public void setInnerId(String innerId) {
        this.innerId = innerId;
    }

    public String getQuestionSetName() {
        return questionSetName;
    }

    public void setQuestionSetName(String questionSetName) {
        this.questionSetName = questionSetName;
    }

    public String getQuestionAnswers() {
        return questionAnswers;
    }

    public void setQuestionAnswers(String questionAnswers) {
        this.questionAnswers = questionAnswers;
    }

    public long getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(long timeConsuming) {
        this.timeConsuming = timeConsuming;
    }
}
