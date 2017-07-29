package orange.spring4.ioc.sample;

public class UserService {
	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Override
	public String toString() {
		return "UserService [userDAO=" + userDAO + "]";
	}
	
}
