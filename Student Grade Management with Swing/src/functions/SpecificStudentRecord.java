package functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;


import db_connection.Db_connection;
import swing.Main;

public class SpecificStudentRecord {
	public static void getSpecific(int rollNo){
		try {
			
			JFrame f = new JFrame("Individual Student");
			Db_connection db = new Db_connection();
			Connection con = db.getConnection();
			Statement st = con.createStatement();
			
			String query = String.format("Select * from student_details where roll_no=%s;", rollNo) ;
			ResultSet r = st.executeQuery(query);
			while(r.next()) {

//			JFrame f = new JFrame();
			JLabel l1 = new JLabel("ROLL NO : ");
			l1.setBounds(70,50,200, 40);
			f.add(l1);
			JTextField t1 = new JTextField(r.getString(1));
			t1.setBounds(200,50,200, 40);
			t1.setEditable(false);
			f.add(t1);
			
			JLabel l2 = new JLabel("NAME : ");
			l2.setBounds(70,100,200, 40);
			f.add(l2);
			JTextField t2 = new JTextField(r.getString(2));
			t2.setBounds(200,100,200, 40);
			t2.setEditable(false);
			f.add(t2);
			
			JLabel l3 = new JLabel("MATHS : ");
			l3.setBounds(70,150,200, 40);
			f.add(l3);
			JTextField t3 = new JTextField(r.getString(3));
			t3.setBounds(200,150,200, 40);
			t3.setEditable(false);
			f.add(t3);
			
			JLabel l4 = new JLabel("ENGLISH : ");
			l4.setBounds(70,200,200, 40);
			f.add(l4);
			JTextField t4 = new JTextField(r.getString(4));
			t4.setBounds(200,200,200, 40);
			t4.setEditable(false);
			f.add(t4);
			
			JLabel l5 = new JLabel("SOCIAL SCIENCE : ");
			l5.setBounds(70,250,200,40);
			f.add(l5);
			JTextField t5 = new JTextField(r.getString(5));
			t5.setBounds(200,250,200,40);
			t5.setEditable(false);
			f.add(t5);
			
			JLabel l6 = new JLabel("SCIENCE : ");
			l6.setBounds(70,300,200,40);
			f.add(l6);
			JTextField t6 = new JTextField(r.getString(6));
			t6.setBounds(200,300,200,40);
			t6.setEditable(false);
			f.add(t6);
			
			JLabel l7 = new JLabel("GRADE : ");
			l7.setBounds(70,350,200,40);
			f.add(l7);
			JTextField t7 = new JTextField(r.getString(8));
			t7.setBounds(200,350,200,40);
			t7.setEditable(false);
			f.add(t7);
			}
			
			JButton b = new JButton("Exit");
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
				
			});
			b.setBounds(250, 420, 80, 30 );
			f.add(b);
			
			JButton bm = new JButton("Menu");
			bm.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Main.menuPage();
					f.dispose();
				}
				
			});
			bm.setBounds(150, 420, 80, 30 );
			f.add(bm);
			
			f.setSize(500,500);
			f.setLayout(null);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
			
					
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
