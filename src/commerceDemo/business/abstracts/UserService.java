package commerceDemo.business.abstracts;

import java.util.List;

import commerceDemo.entities.concretes.User;

public interface UserService {
	void add(User user);
	List<User> getAll();
}
