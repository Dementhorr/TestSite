package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import databese.DBConnection;
import entity.User;

public enum UserDAOImpl {

	INSTANCE;

	public User getU(int id) {
		User user = null;

		PreparedStatement preparedstatement = null;
		ResultSet resultset = null;
		Connection connection = DBConnection.getInstance().getConnection();
		String sql = "Select * from users WHERE id = ?";

		try {

			preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			resultset = preparedstatement.executeQuery();
			while (resultset.next()) {
				user = new User();
				user.setId(resultset.getInt("id"));
				user.setAge(resultset.getInt("age"));
				user.setName(resultset.getString("name"));
				user.setLogin(resultset.getString("login"));
				user.setEmail(resultset.getString("email"));
				user.setPassword(resultset.getString("password"));
				return user;
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return null;

	}

	public static User findUserbyLoginPassword(String login, String password) {
		Connection connection = DBConnection.getInstance().getConnection();
		ResultSet resultset = null;
		PreparedStatement preparedstatement = null;
		String SQLquery = "SELECT * FROM users WHERE login=? and password=?";

		try {
			preparedstatement = connection.prepareStatement(SQLquery);
			preparedstatement.setString(1, login);
			preparedstatement.setString(2, password);
			
			resultset = preparedstatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		User user = null;
		try {
			while (resultset.next()) {
				user = new User();
				user.setId(resultset.getInt("id"));
				user.setAge(resultset.getInt("age"));
				user.setName(resultset.getString("name"));
				user.setLogin(resultset.getString("login"));
				user.setEmail(resultset.getString("email"));
				user.setPassword(resultset.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public static void IsertUser(User user) {
		Connection connection = DBConnection.getInstance().getConnection();
		PreparedStatement prepatedstatement = null;
		
		try {
			prepatedstatement = connection.prepareStatement("insert into users(email, login, password,name,age) " + "values (?,?,?,?,?)");
		
			prepatedstatement.setString(1, user.getEmail());
			prepatedstatement.setString(2, user.getLogin());
			prepatedstatement.setString(3, user.getPassword());
			prepatedstatement.setString(4, user.getName());
			prepatedstatement.setInt(5, user.getAge());

			prepatedstatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
