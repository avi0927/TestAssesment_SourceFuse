package qaautomation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestCase5 {

	public String getDetailsfromBPUserMaster(String email, String ColumnName)
			throws ClassNotFoundException, SQLException {
		
		String result = null;

		String dbUserNAme = "user";
		String password = "password";
		
		String url = "jdbc:sqlserver://dbip;databaseName=dbname";

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection(url, dbUserNAme, password);

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select " + ColumnName+ " from customers where email='"+email+"')");
		System.out.println("**********************");
//		System.out.println(rs.getString(ColumnName));
		
		while (rs.next()) {
			result = rs.getString(ColumnName);
			System.out.println(" : " + result);
		}
		return result;
	}
	
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select " + ColumnName+ " from customers where email='"+email+"')");
	
	email sent=select email_sent from sysmail where username='username'
			if email=true {
				email sent
			}
			
			else {
				email not sent
			}
	
	
	
}
