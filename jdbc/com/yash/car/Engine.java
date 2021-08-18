package com.yash.car;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Engine
{
	static Logger logger=Logger.getAnonymousLogger();
	public static void main() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedatabase","root","root");
				Statement stmt=(Statement) con.createStatement();)
		{
			/*String result="INSERT INTO Engine VALUES(1999,12,'abcd',1),(2018,13,'pqrs',4),"
					+ "(2016,14,'stuv',3),"
					+ "(1945,15,'kpt',2)";
			stmt.executeUpdate(result);
			logger.info("values are inserted...");  */
			ResultSet rs=stmt.executeQuery("select * from Engine");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
