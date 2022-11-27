package com.jsp.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DemoSave {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		
		String sql="INSERT INTO product VALUES(5,'POOL','MASK')";
		Connection connection=null;
		
		try {
			//Load/Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//To Establish the connection
			 connection=DriverManager.getConnection(url, username, password);
			
			//Create the Statement
			Statement statement= connection.createStatement();
			
			//Execute the Statement
			statement.execute(sql);
			System.out.println("All Good");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//Close the Connection
			connection.close();
		}
		
		
		
	}

}
