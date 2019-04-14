import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;


public class DBconnect {

	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBconnect(){
		
		try{
			
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
				st = (Statement) con.createStatement();
				String str;
				str = "select * from names";
				rs = st.executeQuery(str);
				System.out.println("Record for database is -");
				while(rs.next()){
					System.out.println(rs.getString(1) +" " + rs.getString(2));
				}
				
				
		}
		catch(Exception ex)
		{
			System.out.println("Error "+ ex);
		}
	}
}
