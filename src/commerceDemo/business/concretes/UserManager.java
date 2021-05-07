package commerceDemo.business.concretes;

import java.util.List;

import commerceDemo.business.abstracts.UserService;
import commerceDemo.dataAccess.abstracts.UserDao;
import commerceDemo.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if(this.userDao.isEmailExistInUsers(user) && this.userDao.isUserwithEmailPasswordValid(user.getEmail(), user.getPassword())) {
			 System.out.println("Kullan�c� sisteme eklendi:" + user.getEmail());
		}
		System.out.println("Kullan�c� bilgileri ge�ersiz.");
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}
	
}
