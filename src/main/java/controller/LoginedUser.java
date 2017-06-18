package controller;

import javax.servlet.http.HttpSession;

import entity.User;

public class LoginedUser {

	public static void setLoginedUser(HttpSession session,User loginedUser){
		session.setAttribute("loginedUser", loginedUser);
	}
	
	public static User getLoginedUser(HttpSession session){
		return (User)session.getAttribute("loginedUser");
	}
	
	public static void signOutUser(HttpSession session){
		session.removeAttribute("loginedUser");
		
	}
}
