package SwingTutorial05GridLayout;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		GridLayout : Places components in the grid of cells
//					 Each component takes all the place in its available cell 
//					 and each cell is of the same size
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Grid Layout");
		frame.setLayout(new GridLayout(3,3,10,10)); //First for rows and 2nd for columns 3rd for horizontal and 4th for vertical spacing
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
	    JButton b10 = new JButton("10");

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(b10);
		
		
		
		
		frame.setVisible(true);
		
		
		
		
//		b1.setSize(50,50);
//		b2.setSize(50,50);
//		b3.setSize(50,50);
//		b4.setSize(50,50);
//		b5.setSize(50,50);
//		b6.setSize(50,50);
//		b7.setSize(50,50);
//		b8.setSize(50,50);
//		b9.setSize(50,50);
		

	}

}
