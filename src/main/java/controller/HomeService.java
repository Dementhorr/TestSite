package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAOImpl;
import entity.Course;
import entity.User;

/**
 * Servlet implementation class HomeService
 */
@WebServlet("/HomeService")
public class HomeService extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
	User loginedUser = LoginedUser.getLoginedUser(session);
	request.setAttribute("loginedUser",loginedUser);
	String courseId = request.getParameter("course");
	if(courseId != null){
		UserDAOImpl.UpdateUserForegnKey(loginedUser, courseId);
	}
	RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/UserHome.jsp");
	dispatcher.forward(request, response);
	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
