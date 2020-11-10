package gui;

import java.awt.*;
import javax.swing.*;

public class MyFrame4 extends JFrame {
	
	public MyFrame4() {
		setTitle("네번째 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!!!");
		la.setSize(200, 20);
		la.setLocation(200, 50);
		
		for(int i=1; i<10; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setSize(50, 20);
			b.setLocation(i*20, i*15);
			cp.add(b);
		}
		
		setSize(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame4();
	}
	
}
