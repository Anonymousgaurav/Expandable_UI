package com.example.expandable_ui.Model;

import androidx.databinding.Bindable;

public class Fairloy
{
    String question;
    String answer;


    public Fairloy(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
