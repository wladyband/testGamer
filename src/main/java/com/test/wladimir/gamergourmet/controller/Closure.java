package com.test.wladimir.gamergourmet.controller;

import com.test.wladimir.gamergourmet.model.Plate;
import javax.swing.JOptionPane;

public class Closure implements Plate {

    private static final String COMPARED_DISHES = "%s é ________ mas %s não.";
    private static final String WHICH_DISH_DID_YOU_LIKE = "Qual prato você pensou?";
    private static final String CONFIRMATION_TEXT = "Acertei de novo!";

    @Override
    public String namePlate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void question() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void questionLevel(String questionLevel, String negativeAnswer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void positiveAnswer() {
        JOptionPane.showMessageDialog(null, CONFIRMATION_TEXT);
    }

    @Override
    public void negativeAnswer(Plate plate) {
        String plates = JOptionPane.showInputDialog(WHICH_DISH_DID_YOU_LIKE);
        String feature = JOptionPane.showInputDialog(
                String.format(COMPARED_DISHES, plates, plate.namePlate())
        );
        plate.questionLevel(plates, feature);
    }

}
