package com.yash.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DatabaseConnection {
static Logger logger=Logger.getAnonymousLogger();
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		logger.info("DataBase connected");
		Statement st=(Statement) con.createStatement();
		//ResultSet rs=st.executeQuery("select * from employee");
		st.executeUpdate("update employee set extension=456 where firstName='harshada'");
		logger.info("Record updated");
		/*while(rs.next()) {
			logger.info("Employee data is"+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(3));
		}*/
		con.close();
		st.close();
	
	}

}
