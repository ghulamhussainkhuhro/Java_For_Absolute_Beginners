package GUI;

import javax.swing.*;

public class GUI1 {
	
	JFrame frame;
	
	public GUI1() {
		frame = new JFrame();
		
		frame.setTitle("Demo 1");
		frame.setSize(100,100);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new GUI1();
	}
}
