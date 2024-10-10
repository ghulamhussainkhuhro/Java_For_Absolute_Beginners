package SwingTutorial02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingJButton extends JFrame implements ActionListener{
	JButton button;
	public SwingJButton() {
		
		button = new JButton();
		button.setBounds(200,100,100,50);
		button.addActionListener(this);
		button.setText("Button");
		button.setFocusable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setTitle("JButtons");
		this.setVisible(true);
		this.add(button);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Hello!");
		}
		
		
	}

}
