package SwingTutorial12GUIList;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class JList1 extends JFrame {
	
	public String[] data;
	public JList<String> list;
	public JTextField tf ;
	
 
	public JList1(){
		data = new String[8];
		data[0]=("Data 1");
		data[1]=("Data 2");
		data[2]=("Data 3");
		data[3]=("Data 4");
		data[4]=("Data 5");
		data[5]=("Data 6");
		data[6]=("Data 7");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		list = new JList<String>(data);
		list.setVisibleRowCount(5);
		
		JPanel panel = new JPanel();
		tf = new JTextField(20);
		panel.add(new JScrollPane(list));
		panel.add(tf);
		
		list.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getClickCount()==2) {
				String item = (String)list.getSelectedValue();
				
				tf.setText(item);
				
			}
		}
		
		
		});
		this.add(panel);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JList1();
	}

	
}
