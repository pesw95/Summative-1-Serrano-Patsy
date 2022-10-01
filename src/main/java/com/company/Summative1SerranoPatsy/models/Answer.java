package com.company.Summative1SerranoPatsy.models;

import java.util.Objects;

public class Answer {
    private int id;
    private String question;
    private String answer;

    public Answer() {
    }

    public Answer(String answer, int id) {
        this.id = id;

        this.answer = answer;
        this.question = getQuestion();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Answer answer = (Answer) obj;
        return id == answer.getId() &&
                Objects.equals(getQuestion(), answer.getQuestion())&&
                Objects.equals(getAnswer(), answer.getAnswer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getQuestion(), getAnswer());
    }

}
