package com.yash.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class PrepareDemo 
{
	static Logger logger=Logger.getAnonymousLogger();
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedatabase\",\"root\",\"root");
		logger.info("database connected..");
		/*String sql="insert into contact(name,phone) values(?,?)";
		PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(sql);
		pstmt.setString(1,"harshada");
		pstmt.setString(2,"8765456732");
		pstmt.execute();*/

	}
}
