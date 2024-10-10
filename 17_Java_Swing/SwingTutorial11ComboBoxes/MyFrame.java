package SwingTutorial11ComboBoxes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JComboBox<String> comboBox;
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setTitle("Combo Boxes");
		
		String[] batches = {"20sw Batch","21sw Batch","22sw Batch","23sw Batch"};
		comboBox = new JComboBox<String>(batches);
		comboBox.addActionListener(this);
		
		button = new JButton("Submit");
		button.addActionListener(this);
		button.setFocusable(true);
		
		this.add(button);
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==comboBox) {
			System.out.println("You are student of "+comboBox.getSelectedItem());
		}
		if(e.getSource()==button) {
			System.out.println("You are student of "+comboBox.getSelectedItem());
			button.setEnabled(false);
		}
		
	}

}
