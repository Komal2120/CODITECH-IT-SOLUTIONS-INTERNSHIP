package functions;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTextField;

import db_connection.Db_connection;

public class DeleteStudent {
	
	public static int deleteStudent(int rollNo) {
		try {
			Db_connection db = new Db_connection();
			Connection con = db.getConnection();
			Statement st = con.createStatement();
			
			String query = String.format("delete from student_Details where roll_no=%s", rollNo);
			st.executeUpdate(query);
		return 1 ; 
		}
		catch(Exception e) {
			System.out.println();
		}
		
		
	
		return 0 ; 
	}
 

}
