package test;

import java.awt.*;
import javax.swing.*;

public class MyFrameTest2 extends JFrame {
	
	public MyFrameTest2() {
		setTitle("테스트 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(1, 0));
				
		for(int i=0; i<10; i++) {
			JButton btn = new JButton(Integer.toString(i));
			cp.add(btn);
		}
		
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrameTest2();
	}
}
