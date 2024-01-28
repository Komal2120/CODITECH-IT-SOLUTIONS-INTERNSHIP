package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import functions.DeleteStudent;

public class DeleteRecord {
	
	public static void delete() {
		
		JFrame f = new JFrame("DELETE STUDENT RECORD");
		JLabel l1 = new JLabel("DELETE STUDENT RECORD");
		l1.setBounds(70, 30, 200, 40);
		f.add(l1);
		
		JLabel l2 = new JLabel("ROLL NO : ");
		l2.setBounds(70, 100, 100, 40);
		f.add(l2);
		
		JTextField t1 = new JTextField();
		t1.setBounds(150, 100, 100, 40);
		f.add(t1);
		
		JButton b1 = new JButton("Confirm");
		b1.setBounds(120, 150, 80, 40);
		f.add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int rollNo = Integer.parseInt(t1.getText());
				
				if(DeleteStudent.deleteStudent(rollNo)==1) {
					JOptionPane.showMessageDialog(f, "Record Deleted Successfully");
					
				}
				else {
					
					JOptionPane.showMessageDialog(f, "Cannot delete the record! TRY AGAIN!");
					
				}
				
			}
			
		});
		
		JButton b = new JButton("Exit");
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
				
			}
			
		});
		b.setBounds(200, 270, 80, 30 );
		f.add(b);
		JButton bm = new JButton("Menu");
		bm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.menuPage();
				f.dispose();
				
				
			}
			
		});
		bm.setBounds(50, 270, 80, 30 );
		f.add(bm);
		
		
		
		f.setSize(350,350);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}


}
