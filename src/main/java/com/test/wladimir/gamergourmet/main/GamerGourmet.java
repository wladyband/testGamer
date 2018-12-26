package com.test.wladimir.gamergourmet.main;

import com.test.wladimir.gamergourmet.controller.Beginning;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GamerGourmet {

    private static final Integer width = 280;
    private static final Integer height = 140;
    private static final Integer right_square = 40;
    private static final Integer height_square = 12;
    private static final Integer padding_text = 180;
    private static final Integer padding_height = 20;

    private static final Integer right_button = 90;
    private static final Integer height_button = 40;
    private static final Integer padding_button = 55;
    private static final Integer padding_height_button = 30;

    private static final String REMEMBER_ONE_PLATE = "Pense em um prato que gosta.";

    public static void main(String[] args) {
        GamerGourmet jogo = new GamerGourmet();
        jogo.start();
    }

    private void start() {

        final Beginning beginning = new Beginning("massa");
        beginning.setInitialOptions("Lazanha", "Bolo de Chocolate");

        JFrame jframe = new JFrame("Jogo Gourmet");
        JLabel jlabel = new JLabel(REMEMBER_ONE_PLATE);
        JButton jbuttonOk = new JButton("OK");

        jframe.setSize(this.width, this.height);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null);

        jlabel.setBounds(
                this.right_square,
                this.height_square,
                this.padding_text,
                this.padding_height
        );
        jframe.add(jlabel);

        jbuttonOk.setBounds(
                this.right_button,
                this.height_button,
                this.padding_button,
                this.padding_height_button
        );
        jframe.add(jbuttonOk);

        jbuttonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                beginning.question();
            }
        });
    }
}
