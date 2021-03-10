package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	private static final String URL="jdbc:mysql://localhost:3306/hotelrooms";
	private static final String USERNAME="root";
	private static final String PASSWORD="Welcome123";
	
	private DBConnectionUtil() {
	}
	public static Connection getCon()
	{
		Connection connection=null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
		}
		return connection;

	}
}