import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;



public class Main1
{
	
	public static void main(String[] args) throws Exception
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
		
		
		
		PreparedStatement s = (PreparedStatement) conn.prepareStatement("Select * from names");
		ResultSet rs = s.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}
	}

}
