package entity;

public class Course {

	private int id;
	public Course(String courseName, String address, String company, String teacher, int numOfRegistred) {
		CourseName = courseName;
		Address = address;
		Company = company;
		Teacher = teacher;
		NumOfRegistred = numOfRegistred;
	}
	public Course(){
		
	}
	private String CourseName;
	private String Address;
	private String Company;
	private String Teacher;
	private int NumOfRegistred;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getTeacher() {
		return Teacher;
	}
	public void setTeacher(String teacher) {
		Teacher = teacher;
	}
	public int getNumOfRegistred() {
		return NumOfRegistred;
	}
	public void setNumOfRegistred(int numOfRegistred) {
		NumOfRegistred = numOfRegistred;
	}
	@Override
	public String toString() {
		return "You are registered on " + CourseName + " course ,address is" + Address + " company is " + Company + ". Teacher of a course "
				+ Teacher + "";
	}
	
}
