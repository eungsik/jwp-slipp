package core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/slipp_dev?useUnicode=true&characterEncoding=utf8";
		String id = "slipp";
		String pw = "password"; 
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url,id,pw);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
