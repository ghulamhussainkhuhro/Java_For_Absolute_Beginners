package SwingTutorial01;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Swing2_MyFrame extends JFrame{
	
	public Swing2_MyFrame() {
		this.setSize(300, 300); 
		this.setTitle("Swing 1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setDefaultCloseOperation(Jthis.HIDE_ON_CLOSE);
//		this.setDefaultCloseOperation(Jthis.DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		
		ImageIcon image  = new ImageIcon("My_Image_1.png");
		
		this.setIconImage(image.getImage());
//		---> for default colors
		this.getContentPane().setBackground(Color.CYAN); // for default colors
//		---> for custom colors
//		RGB value
		this.getContentPane().setBackground(new Color(0,0,0));// RGB 0-255
//		HexaDecimal values
		this.getContentPane().setBackground(new Color(0xFFFF00));

	}
	
	public static void main(String[] args) {
//		creating instance of Swing2_Myframe
		new Swing2_MyFrame(); // anonymous object
		
	}

}
