package swing;

import java.awt.*;
import javax.swing.*;

public class SwingEx1 extends JFrame {
	public SwingEx1() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new GridLayout());
		
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
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingEx1();
	}

}
