package SwingTutorial01;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Swing3_Labels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Adding image to label
//		we can also set text by just passing the text when creating JLabel Instance
//		JLabel label = new JLabel("Bro, What's problem with you?");
		
		ImageIcon myIcon = new ImageIcon("loginAvatar.jpeg");
		Border border = BorderFactory.createLineBorder(Color.red,5);// for setborder method
		
		JLabel label = new JLabel();// create a label
		label.setText("Bro, What's problem with you?");// set text of label
		label.setIcon(myIcon);
		label.setHorizontalTextPosition(JLabel.CENTER);//set text Left , Right , Center of image icon
		label.setVerticalTextPosition(JLabel.TOP);//set text Top , Bottom , Center of image icon
		label.setForeground(Color.red); // default colors
		label.setForeground(new Color(0xFF0000));// also red but customized
		label.setFont(new Font("MV Boli",Font.BOLD,20));//set font of text
		label.setIconTextGap(10);// set gap between image icon and text we can pass negative integers too
		label.setBackground(Color.CYAN);//it wil set background color but nothing will change
//		untill...
		label.setOpaque(true);// display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);// set vertical position of icon+text within label center top bottom
		label.setHorizontalAlignment(JLabel.CENTER);// set Horizontal position of icon+text within label center top bottom
		label.setBounds(100, 100, 400, 400);//set x and y position within frame as well as dimensions
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);//adding label to frame
//		Our layout manager is using bordered layout so it will add the string at centre on left side
		frame.pack(); // automtically sets the size warning add all the methods before using pack() otherwise it won't work
		
	}

}
