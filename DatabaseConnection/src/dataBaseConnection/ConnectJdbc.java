package dataBaseConnection;
import java.sql.*;

public class ConnectJdbc {

	public static void main(String[] args)
	throws Exception
	{
	Connection con = null;
	String url = "jdbc:mysql://localhost:3306/learning";
	String username = "root";
	String password = "asus";
	
		con = DriverManager.getConnection(url,username,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Show tables");
	    System.out.println("Tables in the current database: ");
	    while(rs.next()) {
	       System.out.print(rs.getString(1));
	       System.out.println();
	    }
	    ResultSet rss=stmt.executeQuery("Select * from student");
	    System.out.println("Table information");
	    while(rss.next())
	    {
	    	System.out.println(rss.getString(1)+" "+rss.getString(2)+" "+rss.getString(3));
	    }
	}
}
