package commerceDemo.core;

import commerceDemo.entities.concretes.User;
import commerceDemo.googleLogin.GoogleLoginManager;

public class GoogleLoginManagerAdapter implements GoogleLoginService{
	public void login(User user) {
		GoogleLoginManager manager = new GoogleLoginManager();
		manager.login(user.getEmail(), user.getPassword());
	}
	
	
}
