
package com.test.wladimir.gamergourmet.model;


public interface Plate {
	String namePlate();
        void question();
	void questionLevel(String positiveAnswer, String negativeAnswer);
        void positiveAnswer();
	void negativeAnswer(Plate plate);
}
