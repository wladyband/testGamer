
package com.test.wladimir.gamergourmet.main;

import com.test.wladimir.gamergourmet.controller.Beginning;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GamerGourmet {
    private static final String REMEMBER_ONE_PLATE = "Pense em um prato que gosta.";
	
	public static void main(String[] args) {
		GamerGourmet jogo = new GamerGourmet();
		jogo.start();		
	}
	
	private void start() {
		final Beginning beginning  = new Beginning("massa");
		beginning.setInitialOptions("Lazanha", "Bolo de Chocolate");
		
		JFrame jframe = new JFrame("Jogo Gourmet");
		JLabel jlabel = new JLabel(REMEMBER_ONE_PLATE);
		JButton jbuttonOk = new JButton("OK");
		
        jframe.setSize(300, 200);
        jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(null);
		
		jlabel.setBounds(50, 40, 200, 30);
		jframe.add(jlabel);
		
		jbuttonOk.setBounds(90, 100, 100, 30);
		jframe.add(jbuttonOk);
		
		jbuttonOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				beginning.question();
			}
		});
	}
}
