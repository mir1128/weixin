package com.wxservice.ItemPool;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String          question;
    private List<String>    options = new ArrayList<String>();
    private String          answer;

    public Item() {
    }

    public Item(String question, List<String> options, String answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void addOptions(String option){
        options.add(option);
    }
}
