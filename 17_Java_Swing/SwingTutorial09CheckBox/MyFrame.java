package SwingTutorial09CheckBox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JCheckBox checkbox;
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton();
		button.addActionListener(this);
		button.setText("Submit");
		button.setFocusable(false);
		
		checkbox = new JCheckBox();
		checkbox.setText("I'm not a robot!");
		checkbox.setFocusable(false);
		checkbox.setFont(new Font("Consolas",Font.PLAIN , 25));
		
		this.add(button);
		this.add(checkbox);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println(checkbox.isSelected());
		}
		
	}

}
