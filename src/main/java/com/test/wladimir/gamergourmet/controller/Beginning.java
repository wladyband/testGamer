package com.test.wladimir.gamergourmet.controller;

import com.test.wladimir.gamergourmet.model.Plate;
import javax.swing.JOptionPane;

public class Beginning implements Plate {

    private static final String TEXT_OF_A_QUESTION = "O prato que você pensou é %s?";

    private String namePlate;
    private Plate positive;
    private Plate negative;

    public Beginning(String namePlate) {
        this.namePlate = namePlate;
        this.positive = new Closure();
        this.negative = new Closure();
    }

    public void setInitialOptions(String optionsPositive, String optionsNegative) {
        this.positive = new Beginning(optionsPositive);
        this.negative = new Beginning(optionsNegative);
    }

    @Override
    public String namePlate() {
        return this.namePlate;
    }

    @Override
    public void question() {
        String question = String.format(TEXT_OF_A_QUESTION, this.namePlate);
        int answer = JOptionPane.showConfirmDialog(null, question, "Pergunta", JOptionPane.YES_NO_OPTION);

        if (Integer.valueOf(answer).equals(JOptionPane.YES_OPTION)) {
            this.positive.positiveAnswer();
        } else {
            this.negative.negativeAnswer(this);
        }
    }

    @Override
    public void questionLevel(String positiveAnswer, String negativeAnswer) {
        this.positive = new Beginning(positiveAnswer);
        this.negative = new Beginning(this.namePlate);
        this.namePlate = negativeAnswer;
    }

    @Override
    public void positiveAnswer() {
        this.question();
    }

    @Override
    public void negativeAnswer(Plate plate) {
        this.question();
    }

}
