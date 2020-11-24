package swing;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class SwingEx3 extends JFrame {
	public SwingEx3() {
		Random r = new Random();
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(null);
				
		for(int i=0; i<20; i++) {
			JLabel dot = new JLabel();
			dot.setSize(10, 10);
			dot.setLocation((int)(r.nextInt(250)), (int)(r.nextInt(250)));
			dot.setBackground(Color.RED);
			dot.setOpaque(true);
			cp.add(dot);
		}
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingEx3();
	}

}
