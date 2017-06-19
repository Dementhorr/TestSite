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
 * Servlet implementation class DoRegistration
 */
@WebServlet("/DoRegistration")
public class DoRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user;

		String errorMsg = null;
		String name = request.getParameter("fname");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		String login = request.getParameter("log");
		int age = 0;
		try {
		 age = Integer.parseInt(request.getParameter("age"));
		}catch (Exception e) {
		} 		
		boolean error = false;

		if (name == null || login == null || email == null || password == null || (age <= 5 && age >= 100) 
				|| name.length()==0 || login.length()==0 || email.length()==0 || password.length()==0  ) {
			errorMsg = "Incorrect dates";
			error = true;
		} else {
			user = UserDAOImpl.findUserbyLogin(login);
			if (user != null) {
				errorMsg = "There already is user with that like login";
				error = true;
			}
		}
		if(error){
			user = new User();
			user.setName(name);
			user.setAge(age);
			user.setEmail(email);
			request.setAttribute("errorString", errorMsg);
			request.setAttribute("name", user.getName());
			request.setAttribute("age", user.getAge());
			request.setAttribute("email", user.getEmail());
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/registration.jsp");
			dispatcher.forward(request, response);
		}
		if (!error) {
			user = new User(login, email, password, age, name);
			HttpSession session = request.getSession();
			LoginedUser.setLoginedUser(session, user);
			UserDAOImpl.InsertUser(user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Login");
			dispatcher.forward(request, response);
		}

	}

}
