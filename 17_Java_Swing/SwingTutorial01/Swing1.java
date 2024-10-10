package SwingTutorial01;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Swing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Jframe is a GUI component to add Frames
		JFrame frame = new JFrame();
		frame.setSize(300, 300); //Set Size in x and y component
		frame.setTitle("Swing 1");//Set Title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// when we press X it only closes frame but in background it is running
//		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);// user cannot resize frame
		frame.setVisible(true);// make frame visible
		
		ImageIcon image  = new ImageIcon("My_Image_1.png");// Creates an image icon
		
		frame.setIconImage(image.getImage());// set the above image as icon of frame
//		---> for default colors
		frame.getContentPane().setBackground(Color.CYAN); // for default colors
//		---> for custom colors
//		RGB value
		frame.getContentPane().setBackground(new Color(0,0,0));// RGB 0-255
//		HexaDecimal values
		frame.getContentPane().setBackground(new Color(0xFFFF00));
		

	}

}
