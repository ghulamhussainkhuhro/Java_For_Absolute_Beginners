package GuiDemo1;

import javax.swing.*;

public class DemoGui {
	
	JFrame frame;
	
	
	public DemoGui() {
		frame = new JFrame();
		
		frame.setTitle("Demo 1");
		frame.setSize(100,100);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new DemoGui();
	}
}


