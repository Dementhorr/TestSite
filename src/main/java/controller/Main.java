package controller;

import java.sql.SQLException;

import dao.UserDAOImpl;
import entity.User;

public class Main {

	public static void main(String[] args) {
		UserDAOImpl usr = UserDAOImpl.INSTANCE;
		System.out.println(usr.loginToSite("Dementhor","qwerty123"));
		//System.out.println(usr.getU(2));
		//System.out.println(usr.IsertUser(user));

	//	User user = new User("","","","","");
	}

}
