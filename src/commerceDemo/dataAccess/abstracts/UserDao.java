package commerceDemo.dataAccess.abstracts;


import java.util.List;

import commerceDemo.entities.concretes.User;

public interface UserDao {
	void add(User user);
	List<User> getAll();
	boolean isEmailExistInUsers(User user);
	boolean isUserwithEmailPasswordValid(String email, String password);
	
}
