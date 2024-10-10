package SwingTutorial12GUIList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.util.ArrayList;

public class ListToTextFields {
    private JFrame frame;
    private JList<String> list;
    private JTextField textField1;
    private ArrayList<String> dataList;

    public ListToTextFields() {
        dataList = new ArrayList<>();
        dataList.add("Item 1");
        dataList.add("Item 2");
        dataList.add("Item 3");
        dataList.add("Item 4");
        dataList.add("Item 5");
        dataList.add("Item 6");
        dataList.add("Item 7");
        dataList.add("Item 8");
        dataList.add("Item 9");
        dataList.add("Item 10");
        dataList.add("Item 11");
        dataList.add("Item 12");
        

        frame = new JFrame("List to Text Fields");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        list = new JList<>(dataList.toArray(new String[0]));
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListSelectionListener() {
            
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if (!e.getValueIsAdjusting()) {
                    String selectedValue = list.getSelectedValue();
                    textField1.setText(selectedValue);
                    
                }
				
			}
        });

        textField1 = new JTextField(20);
        

        frame.add(new JScrollPane(list));
        frame.add(textField1);
        

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ListToTextFields();
    }
}


