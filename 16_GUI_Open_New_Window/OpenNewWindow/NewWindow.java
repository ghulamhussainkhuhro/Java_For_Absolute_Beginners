package OpenNewWindow;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	public NewWindow() {
		
		label.setBounds(100,100 ,250, 50);
		label.setText("This is new Window");
		label.setBackground(Color.yellow);
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setBackground(Color.CYAN);
		frame.setTitle("New Window");
		frame.setVisible(true);
		
	}

}
