package gui;

import java.awt.*;
import javax.swing.*;

public class MyFrame2 extends JFrame {
	
	public MyFrame2() {
		setTitle("두번째 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setBackground(Color.orange);
		cp.setLayout(new GridLayout(3, 3, 10, 10));
		
		cp.add(new JButton("버튼 1"));
		cp.add(new JButton("버튼 2"));
		cp.add(new JButton("버튼 3"));
		cp.add(new JButton("버튼 4"));
		cp.add(new JButton("버튼 5"));
		cp.add(new JButton("버튼 6"));
		cp.add(new JButton("버튼 7"));
		cp.add(new JButton("버튼 8"));
		cp.add(new JButton("버튼 9"));
		
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame2();
	}

}
