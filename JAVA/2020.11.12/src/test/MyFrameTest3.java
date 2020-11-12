package test;

import java.awt.*;
import javax.swing.*;

public class MyFrameTest3 extends JFrame {
	
	public MyFrameTest3() {
		setTitle("Let's Study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout(5, 7));
				
		cp.add(new JButton("West"), BorderLayout.WEST);
		cp.add(new JButton("East"), BorderLayout.EAST);
		cp.add(new JButton("North"), BorderLayout.NORTH);
		cp.add(new JButton("South"), BorderLayout.SOUTH);
		cp.add(new JButton("Center"), BorderLayout.CENTER);
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrameTest3();
	}
}
