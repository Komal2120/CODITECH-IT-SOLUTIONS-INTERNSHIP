package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db_connection { 

	public static Connection con ;
	public Connection getConnection() {
		try {
		     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","password");
			 
			}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
		
	}
	
}
