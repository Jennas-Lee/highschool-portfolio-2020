package gui;

import java.awt.*;
import javax.swing.*;

public class MyFrame3 extends JFrame {

	public MyFrame3() {
		setTitle("세번째 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setBackground(Color.pink);
		cp.setLayout(new GridLayout());
		
		for(int i=1; i<11; i++) {
			cp.add(new JButton("버튼 " + i));
		}
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame3();
	}

}
