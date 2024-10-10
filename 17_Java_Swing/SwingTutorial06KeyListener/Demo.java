package SwingTutorial06KeyListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Frame extends JFrame{
	
	Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setBounds(200, 200, 500,500);
		JTextField tf = new JTextField();
		tf.setSize(200, 200);
		tf.setText("You clicked button");
		JButton b1 = new JButton("Click me");
		
		b1.setSize(100, 50);
		this.add(b1);
		this.add(tf);
		tf.setVisible(false);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button Clicked!");
				tf.setVisible(true);
				
				
			}
		});
		
		JButton b2 = new  JButton("Submit");
		b2.setSize(100,100);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Hi");
				
			}
		});
		this.add(b2);
		this.setVisible(true);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame();

	}

}
