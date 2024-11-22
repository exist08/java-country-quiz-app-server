package com.anurag.countryquiz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int result_id;
    private int user_id;
    private int questions_asked;
    private int user_answered;
    private int correct_answer;
    private String username;
    private int score;

    public Result() {}

    public int getResult_id() {
        return result_id;
    }

    public void setResult_id(int result_id) {
        this.result_id = result_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getQuestions_asked() {
        return questions_asked;
    }

    public void setQuestions_asked(int questions_asked) {
        this.questions_asked = questions_asked;
    }

    public int getUser_answered() {
        return user_answered;
    }

    public void setUser_answered(int user_answered) {
        this.user_answered = user_answered;
    }

    public int getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(int correct_answer) {
        this.correct_answer = correct_answer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
