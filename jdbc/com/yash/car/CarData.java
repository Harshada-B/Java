package com.yash.car;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class CarData 
{
	static Logger logger=Logger.getAnonymousLogger();
	public static void main(String args[]) throws ClassNotFoundException,SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedatabase","root","root");
				Statement stmt=(Statement) con.createStatement();)
		{
			//String sql_car="create table CarData"+"(regi_no INT,"+"owner_name VARCHAR(30),"+"type VARCHAR(30),"+"engine DATE,"+"PRIMARY KEY(regi_no))";
			//stmt.executeUpdate(sql_car);
			//logger.info("Created table in given database...");  
			
			//----------value insert-------
			/*String result="INSERT INTO CarData VALUES(1,'Akshada','maruti','1999-02-12'),"
					+ "(2,'sam','hundai','1992-12-06'),"
					+ "(3,'Akash','hundai','1999-08-12'),"
					+ "(4,'mack','maruti','2019-12-05')";
			stmt.executeUpdate(result);
			logger.info("values are inserted...");  */
			//-------update -------
			//stmt.executeUpdate("update CarData set regi_no=2 where owner_name='harshada'");
			//logger.info("Record updated");
			ResultSet rs=stmt.executeQuery("select * from CarData");
			while(rs.next()) {
				logger.info("Employee data is"+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			//con.close();
			//stmt.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
