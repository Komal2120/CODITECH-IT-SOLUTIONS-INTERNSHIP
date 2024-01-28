package functions;

import java.sql.Connection;
import java.sql.Statement;

import db_connection.Db_connection;

public class AddStudent {
	
	

	public static void newRecord(String name , int maths ,int socialsci , int science, int english) {
		int total = maths + socialsci +english +science ;
		String grade = Grade.calculateGrade(total);
		
		try {
			Db_connection db = new Db_connection();
			Connection con = db.getConnection();
			Statement st = con.createStatement();
			
			String query = String.format("insert into student_details(name,maths,english,socialsci,science,total,grade) value ('%s',%s,%s,%s,%s,%s,'%s');",name,maths,english,socialsci,science,total,grade);
			st.executeUpdate(query);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}
