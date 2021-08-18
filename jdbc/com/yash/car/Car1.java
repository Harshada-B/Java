package com.yash.car;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Car1 
{
	static Logger logger=Logger.getAnonymousLogger();
	public static void main(String args[]) throws ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement stmt=(Statement) con.createStatement();)
		{
			String sql_car="create table car1"+"(regi_no INT,"+"owner_name VARCHAR(30),"+"type VARCHAR(30),"+"engine DATE,"+"PRIMARY KEY(regi_no))";
			stmt.executeUpdate(sql_car);
			/*String result="INSERT INTO CAR VALUES(1,'Akshada','maruti','1999-02-12'),(2,'sam','hundai','1992-12-06'),"
					+ "(3,'Akash','hundai','1999-08-12'),"
					+ "(4,'mack','maruti','2019-12-05')";
			stmt.executeUpdate(result);
			logger.info("values are inserted..."); */  
	       logger.info("Created table in given database...");   
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
