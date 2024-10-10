package SwingTutorial08TextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JTextField textField;
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton();
		button.setSize(80, 40);
		button.setText("Submit");
		button.setFocusable(false);
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas",Font.PLAIN,30));
		textField.setForeground(Color.green);
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);//blinking cursor color
		textField.setText("Username");
//		textField.setEditable(false);
		
		
		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("You entered : "+textField.getText());
//			After entering your name and pressing submit button, user will not be able to rename
			button.setEnabled(false);
			textField.setEditable(false);
			
		}
		
	}
	
	

}
