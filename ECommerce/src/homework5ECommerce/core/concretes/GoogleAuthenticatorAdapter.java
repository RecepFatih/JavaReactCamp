package homework5ECommerce.core.concretes;

import homework5ECommerce.core.abstracts.RegisterService;
import homework5ECommerce.googleAccount.GoogleAuthenticator;

public class GoogleAuthenticatorAdapter implements RegisterService{

	@Override
	public void memberAdd(String email, String password) {
		GoogleAuthenticator member = new GoogleAuthenticator();
		member.authenticator(email, password);
		
	}

}
