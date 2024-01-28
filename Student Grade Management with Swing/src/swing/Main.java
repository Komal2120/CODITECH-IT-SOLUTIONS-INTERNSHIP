package swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
	
	public static void menuPage() {
		JFrame f  = new JFrame();
		JLabel l1 = new JLabel("STUDENT GRADE MANAGEMENT");
		l1.setBounds(90, 50, 200, 40);
		f.add(l1);
		JButton b1 = new JButton("Add New Student");
		b1.setBounds(90,100,200, 40);
		f.add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AddRecord.newRecord();
				f.dispose();
				
			}
			
		});
		
		JButton b2 = new JButton("Retrive Student Record ");
		b2.setBounds(90,150,200, 40);
		f.add(b2);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SpecificStudent.getSpecific();
				f.dispose();
			}
			
		});
		
		JButton b3 = new JButton("View All Records ");
		b3.setBounds(90,200,200, 40);
		f.add(b3);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AllStudent.getAll();
				f.dispose();
				
			}
			
		});
		
		JButton b4 = new JButton("Delete Student Record ");
		b4.setBounds(90,250,200, 40);
		f.add(b4);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DeleteRecord.delete();
				f.dispose();
			}
		});
		

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		Main.menuPage();	
	}
}
