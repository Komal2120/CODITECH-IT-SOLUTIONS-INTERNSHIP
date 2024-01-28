package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import functions.SpecificStudentRecord;

public class SpecificStudent {
public static void getSpecific() {
		
		JFrame f = new JFrame("INDIVIDUAL STUDENT RECORD");
		JLabel l1 = new JLabel("INDIVIDUAL STUDENT RECORD");
		l1.setBounds(70, 90, 200, 40);
		f.add(l1);
		
		JLabel l2 = new JLabel("ROLL NO : ");
		l2.setBounds(70, 130, 100, 40);
		f.add(l2);
		
		JTextField t1 = new JTextField();
		t1.setBounds(150, 150, 100, 40);
		f.add(t1);
		
		JButton b1 = new JButton("Confirm");
		b1.setBounds(150, 200, 80, 40);
		f.add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int rollNo = Integer.parseInt(t1.getText());
				SpecificStudentRecord.getSpecific(rollNo);
				
			}
			
		});
		
		
		f.setSize(350,350);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}

	
}
