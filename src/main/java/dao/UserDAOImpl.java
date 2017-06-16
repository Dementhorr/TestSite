package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import databese.DBConnection;
import entity.User;

public enum UserDAOImpl implements UserDAO {

	INSTANCE;

	

	public User getU(int id) {
		User user = null;

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection connection = DBConnection.getInstance().getConnection();
		String sql = "Select * from users WHERE id = ?";

		try {

			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setAge(rs.getInt("age"));
				user.setName(rs.getString("name"));
				user.setLogin(rs.getString("login"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				return user;
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return null;

	}

	public static User loginToSite(String login, String password)  {
		Connection connection = DBConnection.getInstance().getConnection();
		ResultSet rs = null;
		PreparedStatement ps = null;
		String SQLquery = "SELECT * FROM users WHERE login=? and password=?";

		try {
			ps = connection.prepareStatement(SQLquery);
			ps.setString(1, login);
			ps.setString(2, password);
			rs = ps.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		User user = null;
		try {
			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setAge(rs.getInt("age"));
				user.setName(rs.getString("name"));
				user.setLogin(rs.getString("login"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {		
			e.printStackTrace();
		}

		return user;

	}
public static void IsertUser(User user){
	Connection connection = DBConnection.getInstance().getConnection();
	PreparedStatement ps = null;
	try {
        ps = connection.prepareStatement("insert into users(email, login, password,name,age) " +
                "values (?,?,?,?,?)");
      
        ps.setString(1,user.getEmail());
        ps.setString(2,user.getLogin());
        ps.setString(3,user.getPassword());
        ps.setString(4,user.getName());
        ps.setInt(5,user.getAge());
     
        ps.executeUpdate();
        
    } catch (SQLException e) {
        e.printStackTrace();
    }

}
	
	
	@Override
	public void addUser(User theUser) {

	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User theUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
