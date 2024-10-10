package Question4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFrame extends JFrame implements ActionListener{
	
	JButton addStudent;
	JButton viewStudent;
	

	
	public MyFrame() {
		addStudent = new JButton("Add Student");
		viewStudent = new JButton("View Student");
		
		JLabel label = new JLabel();
		label.setBounds(0, 0, 500, 10);
		label.setText("Student Management System");
		
		JLabel nameLabel = new JLabel("Name : ");
		nameLabel.setBounds(160,30,100,50);
		
		JPanel View_Panel = new JPanel();
		View_Panel.setBounds(160,20,400,400);
		View_Panel.setBackground(Color.cyan);
		
		JTextField name = new JTextField();
		name.setText("Name");
		name.setBounds(260,30,300,50);
		JTextField email = new JTextField();
		JTextField rollno = new JTextField();
		
	
		addStudent.setBounds(0, 20, 150, 50);
		viewStudent.setBounds(0,80 ,150, 50);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setLayout(null);     
		this.add(nameLabel);
		this.add(name);
		this.add(View_Panel);
		this.add(label);
		this.add(addStudent);
		this.add(viewStudent);
		this.setTitle("Student Management System");
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}

}
