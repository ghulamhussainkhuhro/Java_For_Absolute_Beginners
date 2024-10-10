package JOptionPane1;

import javax.swing.JOptionPane;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		JOptionPane : It pops up a standard dialogue box that prompts user for a value
//					  or informs them of something
		
		
		
//		JOptionPane.showMessageDialog(null, "This is plain(simple) message", "My Title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some information", "My Title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Do want to continue?", "My Title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Warning!!!...", "My Title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Error 420 : GF not found!", "My Title", JOptionPane.ERROR_MESSAGE);
		
//		int answer = JOptionPane.showConfirmDialog(null, "Bro, are you student?","Question",JOptionPane.YES_NO_CANCEL_OPTION);
//		System.out.println("0 for yes , 1 for no , 2 for cancel and -1 for exit");
//		we can use if else for switch case for further actions
//		System.out.println(answer);
		
		String answer = JOptionPane.showInputDialog("What is your name?");
		System.out.println("hello "+ answer);
		
		JOptionPane.showOptionDialog(null, "Are you a boy?", "MyTitle", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE , null, null, 0);
	}

}
