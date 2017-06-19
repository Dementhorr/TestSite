package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.LoginedUser;
import databese.DBConnection;
import entity.Course;
import entity.User;

public enum CourseDAOImpl {

	INSTANCE;

	public static Course ShowCheckedCourse(User user) {
		Connection connection = DBConnection.getInstance().getConnection();
		PreparedStatement preparedstatement = null;
		ResultSet resultset = null;
		Course course =null;
		try {
			preparedstatement = connection.prepareStatement(
					"select course.coursename ,course.address, course.company ,course.teacher from users inner join"
					+ " course on users.courseId=course.id where users.id=?;");

			preparedstatement.setInt(1, user.getId());
			resultset = preparedstatement.executeQuery();
			while (resultset.next()) {
				course = new Course();
				course.setCourseName(resultset.getString("coursename"));
				course.setAddress(resultset.getString("address"));
				course.setCompany(resultset.getString("company"));
				course.setTeacher(resultset.getString("teacher"));
				return course;
			}
			
			//preparedstatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
