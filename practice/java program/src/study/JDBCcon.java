package study;
import java.sql.*;

public class JDBCcon {
	public static void main(String[] args) throws SQLException{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","asus");
		if(con!=null)
			System.out.println("works");
		Statement st=con.createStatement();
		String query="INSERT INTO credential VALUES(?,?,?)";
		PreparedStatement stat=con.prepareStatement(query);
		stat.setString(1, "abishek");
		stat.setString(2, "abishek");
		stat.setString(3, "1234567890");
		int count=stat.executeUpdate();
		System.out.println(count);
	}

}
