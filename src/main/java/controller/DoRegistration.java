package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAOImpl;
import entity.User;

/**
 * Servlet implementation class DoRegistration
 */
@WebServlet("/DoRegistration")
public class DoRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user; 
        String errorMsg = null;
        String name = request.getParameter("fname");
        String email = request.getParameter("email");
        String password = request.getParameter("pwd");
        String login = request.getParameter("log");
        int age = Integer.parseInt(request.getParameter("age"));
        boolean error = false;
        
        if(name==null || login==null || email==null || password==null || age<=99){
        	errorMsg="Incorrect dates";
        	error=true;
        }else{
        	//user = UserDAOImpl.INSTANCE.loginToSite(login, password);
        	//if()
        }
        if(!error){
        	user = new User(login,email,password,age,name);
        	UserDAOImpl.IsertUser(user);
        	RequestDispatcher dispatcher = request.getRequestDispatcher("/SeccesLog.jsp");
    		dispatcher.forward(request, response);
        }

	}

}
