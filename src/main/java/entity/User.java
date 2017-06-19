package entity;

public class User {

	private int id;
	private String login;
	private String email;
	private String password;
	private int age;
	private String name;
	private int courseId;
	
	public User( String login, String email, String password, int age, String name) {
		this.login = login;
		this.email = email;
		this.password = password;
		this.age = age;
		this.name = name;
	}
	
	public User() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", emaiiiil=" + email + ", password=" + password + ", age=" + age
				+ ", name=" + name + "]";
	}
	
}
