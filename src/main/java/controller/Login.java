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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("log");
		String password = request.getParameter("pw");
		String errorMsg = null;
		boolean error = false;
		User user = null;

		if (login == null || password == null || login.length() == 0 || password.length() == 0) {
			error = true;
			errorMsg = "No dates input";
		} 
		else {
			user = UserDAOImpl.findUserbyLoginPassword(login, password);
			if (user == null) {
				error = true;
				errorMsg = "User name or password is not correct";
			}

		}
		if (error) {
			user = new User();

			user.setLogin(login);
			user.setPassword(password);
			
			request.setAttribute("errorString", errorMsg);
			request.setAttribute("user", user.getLogin());
			
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);

		}
		if (!error) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/SuccesLoged.jsp");
			dispatcher.forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

}
