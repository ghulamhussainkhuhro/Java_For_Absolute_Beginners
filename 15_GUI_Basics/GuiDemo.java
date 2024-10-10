package GUI;

import javax.swing.*;

public class GuiDemo {
	
	JFrame frame;
	
	
	public GuiDemo() {
		frame = new JFrame();
		
		frame.setTitle("Demo 1");
		frame.setSize(100,100);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new GuiDemo();
	}
}
