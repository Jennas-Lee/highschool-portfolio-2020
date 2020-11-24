package event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Independent extends JFrame {
	public Independent() {
		setTitle("Action 리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		
		btn.addActionListener(new MyActionListener());
		
		cp.add(btn);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action")) {
				b.setText("액션");
				b.setForeground(Color.GRAY);
				b.setBackground(new Color(255, 167, 167));
			} else {
				b.setText("Action");
				b.setForeground(Color.BLACK);
				b.setBackground(new Color(29, 219, 22));
				Independent.this.setTitle(b.getText());
			}
		}
		
	}

	public static void main(String[] args) {
		new Independent();
	}

}

