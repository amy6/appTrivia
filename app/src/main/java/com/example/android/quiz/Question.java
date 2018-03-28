package com.example.android.quiz;

public class Question {

    String question;
    String[] options;

    public Question(String question, String[] options) {
        this.question = question;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }
}
