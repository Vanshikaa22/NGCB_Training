package com.training.beans;

import java.util.List;
import java.util.Objects;

public class Question {

    private Integer id;
    private List<String> Question;

    public Question() {
    }

    public Question(Integer id, List<String> question) {
        this.id = id;
        Question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(id, question.id) &&
                Objects.equals(Question, question.Question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Question);
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", Question=" + Question +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getQuestion() {
        return Question;
    }

    public void setQuestion(List<String> question) {
        Question = question;
    }
}
