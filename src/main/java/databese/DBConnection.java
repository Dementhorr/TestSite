package databese;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static String DB_URL = "jdbc:mysql://localhost:3306/courses?useSSL=false&serverTimezone=UTC";
	private static String USER = "root";
	private static String PASS = "12345";
	private static DBConnection dbConnection;

	public static DBConnection getInstance() {
		if (dbConnection == null) {
			dbConnection = new DBConnection();

			return dbConnection;
		} else {
			return dbConnection;
		}

	}

	Connection connection = null;

	private DBConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public Connection getConnection() {
		return connection;
	}
	
	
	
}
