package dao;

import entity.User;

public interface UserDAO {
	public User getUser(int id);
	public void addUser(User theUser);
	public void deleteUser(int id);
	public void updateUser(User theUser);
	
	
	
}
