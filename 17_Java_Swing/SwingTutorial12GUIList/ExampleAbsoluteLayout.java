package SwingTutorial12GUIList;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExampleAbsoluteLayout {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Form");

        f.setBounds(100, 100, 500, 450);
        f.setLayout(null); // Set layout to null

        JLabel studentform = new JLabel("Student Form");
        studentform.setBounds(200, 0, 100, 20);
        JLabel name = new JLabel("Name:");
        name.setBounds(100, 50, 100, 20);
        JLabel fname = new JLabel("F/name:");
        fname.setBounds(100, 100, 100, 20);
        JLabel caste = new JLabel("Caste:");
        caste.setBounds(100, 150, 100, 20);
        JLabel batch = new JLabel("Batch:");
        batch.setBounds(100, 200, 100, 20);
        
        
        JTextField nametf = new JTextField("");
        nametf.setBounds(200, 50, 150, 20);
        JTextField fnametf = new JTextField("");
        fnametf.setBounds(200, 100, 150, 20);
        JTextField castetf = new JTextField("");
        castetf.setBounds(200, 150, 150, 20);
        
        String batches[]= {"23sw","22sw","24sw"};
        JComboBox<String> comboBox=new JComboBox<>(batches);
        comboBox.setBounds(200, 200, 150, 20);
        
        JButton b1=new JButton("Add");
        b1.setBounds(100, 250, 100, 20);      
        JButton b2=new JButton("Save");
        b2.setBounds(250, 250, 100, 20);
        
        JTextArea ta=new JTextArea();
        ta.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(ta);
        scrollPane.setBounds(100, 300, 250, 100);
        
        JList list=new JList();
        list.setBounds(380, 50, 100, 343);
        DefaultListModel<String> listmodel=new DefaultListModel<>();
        	
        
        f.add(studentform);
        f.add(name);
        f.add(nametf);
        f.add(fname);
        f.add(caste);
        f.add(fnametf);
        f.add(castetf);
        f.add(comboBox);
        f.add(batch);
        f.add(b1);
        f.add(b2);
        f.add(scrollPane);
        //f.add(ta);
        f.add(list);
        
        
        b1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		ta.append("Name: "+nametf.getText()+"\n");
        		ta.append("Father Name: "+fnametf.getText()+"\n");
        		ta.append("Caste: "+castetf.getText()+"\n");
        		ta.append("Batch: "+comboBox.getSelectedItem()+"\n");
        		ta.append("-------------------------\n");
        		
        		listmodel.addElement(nametf.getText());
        		list.setModel(listmodel);
        	}
        	
        });
        
        b2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try (FileOutputStream fout = new FileOutputStream("Student.txt",true)) {
					String data="Name: "+nametf.getText()+"\n"+
							"Father Name: "+fnametf.getText()+"\n"+
							"Caste: "+castetf.getText()+"\n"+
							"Batch: "+comboBox.getSelectedItem()+"\n"
							+"-------------------------\n";
					
					byte[] bytes=data.getBytes();				
					fout.write(bytes);
	
					System.out.println("data Saved");
        		} catch (IOException e1) {
					e1.printStackTrace();
				}
        	}
        	
        });
        list.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			if(e.getClickCount()==1) {
				String selectedValue =(String)list.getSelectedValue();
                nametf.setText(selectedValue);
			}
		}
        
        
        });
        
//        list.addListSelectionListener((ListSelectionListener) new ListSelectionListener() {
//
//			@Override
//			public void valueChanged(ListSelectionEvent e) {
//				 if (!e.getValueIsAdjusting()) {
//	                    String selectedValue =(String)list.getSelectedValue();
//	                    nametf.setText(selectedValue);
//	                }
//			}
//        	
//        }
//        		
//       );
        	
      
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}