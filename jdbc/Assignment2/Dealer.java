package Assignment2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Dealer 
{
	static Logger logger=Logger.getAnonymousLogger();
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedatabase","root","root");
				Statement stmt=(Statement) con.createStatement();)
		{
			//logger.info("Database Connected");
			//-------------TABLE CREATED-----------------
			/*String sql="create table dealer"+"(regi_no int,"+"nameofshop varchar(30),"
					+ ""+"ownername varchar(30),"
					+ ""+"pname varchar(30),"
					+ ""+"primary key(regi_no))";
			stmt.executeUpdate(sql);
			logger.info("Table created in database");*/
			//---------------SELECT QUERY--------------//
			ResultSet rs=stmt.executeQuery("Select ownername from dealer");
			while(rs.next())
			{
				logger.info("Owner names are:"+rs.getString(1));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
