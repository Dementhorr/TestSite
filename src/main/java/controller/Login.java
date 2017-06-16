package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAOImpl;
import entity.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String login = request.getParameter("log");
		String password = request.getParameter("pw");
		boolean error = false;
		String errorMsg = null;
		User user = null;

		if (login == null || password == null) {
			error = true;
			errorMsg = "No dates input";
		}
		user = UserDAOImpl.loginToSite(login, password);
		if (user != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/SeccesLog.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
