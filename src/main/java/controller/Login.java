package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CourseDAOImpl;
import dao.UserDAOImpl;
import entity.Course;
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
			errorMsg = "No all dates are inputed";
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
			request.setAttribute("errorString", errorMsg);
			request.setAttribute("user", user.getLogin());
			
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);

		}
		if (!error) {
			//Course course=null;
			//course = CourseDAOImpl.ShowCheckedCourse(user);
			HttpSession session = request.getSession();
			LoginedUser.setLoginedUser(session, user);
			//session.setAttribute("course", course);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/HomeService");
			dispatcher.forward(request, response);
			
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

}
