package SwingTutorial01;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Swing4Panels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageIcon icon = new ImageIcon("passkey.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
//		label.setVerticalAlignment(JLabel.BOTTOM);
//		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(0,0,75,75);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
//		redPanel.setLayout(new BorderLayout());
		redPanel.setLayout(null);
		
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);
//		bluePanel.setLayout(new BorderLayout());
		bluePanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,250,500,250);
//		greenPanel.setLayout(new BorderLayout());
		greenPanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750,750);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Swing Panels");
		frame.add(redPanel);
		greenPanel.add(label);
		frame.add(bluePanel);
//		bluePanel.add(label);
		frame.add(greenPanel);
//		greenPanel.add(label);
	}

}
