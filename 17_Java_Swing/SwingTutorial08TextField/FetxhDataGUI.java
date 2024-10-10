package SwingTutorial08TextField;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FetxhDataGUI extends JFrame {

	private List<String> dataList = new ArrayList<>();

	public FetxhDataGUI() {
		setTitle("Fetch Data GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		// Add data to the list
		dataList.add("Data 1");
		dataList.add("Data 2");
		dataList.add("Data 3");

		// Create text fields to display data
		for (int i = 0; i < dataList.size(); i++) {
			JTextField textField = new JTextField(20);
			textField.setText(dataList.get(i));
			add(textField);
		}

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new FetxhDataGUI();
	}
}
