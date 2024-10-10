package SwingTutorial06KeyListener;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{
	
	JLabel label;
	ImageIcon icon;
	
	public MyFrame() {
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("KeyListener");
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("passkey.png");
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
//		label.setBackground(Color.red);
//		label.setOpaque(true);
	
		label.setIcon(icon);
		this.getContentPane().setBackground(Color.cyan);
		this.add(label);
		this.setVisible(true);
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// keyTyped : Invoked when a key is typed. Uses KeyChar, char Output
		switch(e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-10, label.getY());
			break;
		case 'w': label.setLocation(label.getX(), label.getY()-10);
			break;
		case 's': label.setLocation(label.getX(), label.getY()+10);
			break;
		case 'd': label.setLocation(label.getX()+10, label.getY());
			break;
		default : System.out.println("Enter valid choice!");
	
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// keyPressed : Invoked when a physical key is pressed down. uses KeyCode, int output
		switch(e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-10, label.getY()); //left arrow 37
			break;
		case 38: label.setLocation(label.getX(), label.getY()-10); //up arrow 38
			break;
		case 39: label.setLocation(label.getX()+10, label.getY()); // down arrow 39
			break;
		case 40: label.setLocation(label.getX(), label.getY()+10); // right arrow 40
			break;
		default : System.out.println("Enter valid choice!");
	
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// keyReleased : called when a button is released
		System.out.println("You released a key char : "+ e.getKeyChar());
		System.out.println("You released key code : "+e.getKeyCode());
		
	}

}
