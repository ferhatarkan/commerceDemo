package commerceDemo.dataAccess.concretes;


import java.util.List;

import commerceDemo.dataAccess.abstracts.UserDao;
import commerceDemo.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	List<User> users; 
	
	public InMemoryUserDao(List<User> users) {
		super();
		this.users = users;
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("User: " + user.getEmail() + " added.");
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public boolean isEmailExistInUsers(User user) {
		for( User u : users) {
			if(!(u.getEmail()==user.getEmail())) {
				System.out.println("Bu Email kabul edilmiyor.");
				return false;
				}
			
		}
		System.out.println("email kabul edildi.");
		return true;
	}

	@Override
	public boolean isUserwithEmailPasswordValid(String email, String password) {
		for( User u : users) {
			if(!(u.getEmail()==email && u.getPassword()==password)) {
				System.out.println("Bu Email veya þifre hatalý.");
				return false;
				}
			
		}
		System.out.println("Giriþ baþarýlý");
		return true;
	}

}
