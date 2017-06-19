package controller;

import java.sql.SQLException;

import dao.CourseDAOImpl;
import dao.UserDAOImpl;
import entity.Course;
import entity.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		Course course = CourseDAOImpl.ShowCheckedCourse(user);
	}

}
