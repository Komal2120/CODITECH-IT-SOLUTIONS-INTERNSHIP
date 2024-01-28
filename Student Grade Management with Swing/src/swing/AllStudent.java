package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import db_connection.Db_connection;
import javax.swing.table.DefaultTableModel;

public class AllStudent {
	
	public static void getAll(){
		try {
			
			JFrame f = new JFrame("All Students");
			Db_connection db = new Db_connection();
			Connection con = db.getConnection();
			Statement st = con.createStatement();
			
			String query = "Select* from student_details;" ;
			
			JButton b = new JButton("Exit");
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
				
			});
			b.setBounds(400, 400, 80, 30 );
			f.add(b);
			
			JButton bm = new JButton("Menu");
			bm.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Main.menuPage();
					f.dispose();
				}
				
			});
			bm.setBounds(300, 400, 80, 30 );
			f.add(bm);
			
			DefaultTableModel model = new DefaultTableModel(new String[] {"Roll No","Name","Maths","English","Science"," Social Science","Grade"}, 0);
			
			ResultSet r = st.executeQuery(query);
			while(r.next()) {
				String rollNo = r.getString(1);
				String name = r.getString(2);
				String maths = r.getString(3);
				String english = r.getString(4);
				String socialSci = r.getString(5);
				String science = r.getString(6);
				String total = r.getString(7);
				String grade = r.getString(8);
				model.addRow(new Object[] {rollNo,name,maths,english,socialSci,science,grade});
				
				JTable j =new JTable(model);
				j.setBounds(200, 250, 500, 300);
				 JScrollPane sp = new JScrollPane(j);
			        f.add(sp);
			        f.setSize(800, 500);
			        f.setLocationRelativeTo(null);
			        f.setVisible(true);
				
			}
					
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
	


}
