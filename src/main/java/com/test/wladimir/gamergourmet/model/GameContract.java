package com.test.wladimir.gamergourmet.model;

public interface GameContract {

    String namePlate();

    void question();

    void questionLevel(String positiveAnswer, String negativeAnswer);

    void positiveAnswer();

    void negativeAnswer(GameContract plate);
}
