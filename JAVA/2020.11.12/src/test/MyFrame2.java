package test;

import java.awt.*;
import javax.swing.*;

public class MyFrame2 extends JFrame {
	
	public MyFrame2() {
		setTitle("라벨 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel la = new JLabel("자바 좋아");
		cp.add(la);
		la.setForeground(Color.PINK);
		la.setFont(new Font("궁서체", Font.BOLD, 40));
		la.setBackground(Color.DARK_GRAY);
		la.setOpaque(true);
		
		JTextField text = new JTextField(20);
		cp.add(text);
		
		JButton btn = new JButton("정말 좋아");
		cp.add(btn);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame2();
	}

}
