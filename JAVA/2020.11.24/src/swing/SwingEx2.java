package swing;

import java.awt.*;
import javax.swing.*;

public class SwingEx2 extends JFrame {
	public SwingEx2() {
		setTitle("4X4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton b0 = new JButton("0");
		b0.setBackground(Color.RED);
		cp.add(b0);
		JButton b1 = new JButton("1");
		b1.setBackground(Color.ORANGE);
		cp.add(b1);
		JButton b2 = new JButton("2");
		b2.setBackground(Color.YELLOW);
		cp.add(b2);
		JButton b3 = new JButton("3");
		b3.setBackground(Color.GREEN);
		cp.add(b3);
		JButton b4 = new JButton("4");
		b4.setBackground(Color.MAGENTA);
		cp.add(b4);
		JButton b5 = new JButton("5");
		b5.setBackground(Color.BLUE);
		cp.add(b5);
		JButton b6 = new JButton("6");
		b6.setBackground(Color.DARK_GRAY);
		cp.add(b6);
		JButton b7 = new JButton("7");
		b7.setBackground(Color.GRAY);
		cp.add(b7);
		JButton b8 = new JButton("8");
		b8.setBackground(Color.CYAN);
		cp.add(b8);
		JButton b9 = new JButton("9");
		b9.setBackground(Color.LIGHT_GRAY);
		cp.add(b9);
		JButton b10 = new JButton("10");
		b10.setBackground(Color.RED);
		cp.add(b10);
		JButton b11 = new JButton("11");
		b11.setBackground(Color.ORANGE);
		cp.add(b11);
		JButton b12 = new JButton("12");
		b12.setBackground(Color.YELLOW);
		cp.add(b12);
		JButton b13 = new JButton("13");
		b13.setBackground(Color.GREEN);
		cp.add(b13);
		JButton b14 = new JButton("14");
		b14.setBackground(Color.MAGENTA);
		cp.add(b14);
		JButton b15 = new JButton("15");
		b15.setBackground(Color.BLUE);
		cp.add(b15);
		
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingEx2();
	}

}
