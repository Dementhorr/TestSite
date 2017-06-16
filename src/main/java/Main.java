import dao.UserDAOImpl;

public class Main {

	public static void main(String[] args) {
		UserDAOImpl userDAO = UserDAOImpl.INSTANCE;
		System.out.println(userDAO.getUser(1));

	}

}
