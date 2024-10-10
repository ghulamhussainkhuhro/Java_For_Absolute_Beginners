package SwingTutorial10RadioButtons;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	
	JRadioButton pizzaButton;
	JRadioButton BurgerButton;
	JRadioButton friesButton;
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setTitle("Radio Buttons");
		
		pizzaButton = new JRadioButton("Pizza");
		pizzaButton.setFocusable(false);
		pizzaButton.addActionListener(this);
		
		BurgerButton = new JRadioButton("Burger");
		BurgerButton.setFocusable(false);
		BurgerButton.addActionListener(this);
		
		friesButton = new JRadioButton("Fries");
		friesButton.setFocusable(false);
		friesButton.addActionListener(this);
		
//		at this time above radio buttons aren't grouped so they can be selected all at a time
//		so... Group them
		
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(BurgerButton);
		group.add(friesButton);
		
		
		this.add(pizzaButton);
		this.add(BurgerButton);
		this.add(friesButton);
		this.pack();
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==pizzaButton) {
			System.out.println("Pizza is ordered..!");
		}
		else if(e.getSource()==BurgerButton) {
			System.out.println("Burger is ordered..!");
		}
		else if(e.getSource()==friesButton) {
			System.out.println("Fries are ordered..!");
		}
	}

}
