package hrms.hiringsystem.business.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hiringsystem.business.abstracts.UserService;
import hrms.hiringsystem.dataAccess.abstracts.UserDao;
import hrms.hiringsystem.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	

	@Override
	public boolean checkIfEmailAlreadyExists(String email) {
		
		User user = this.userDao.findByEmail(email);
		if (user != null) {

			return true;
		}else {
			return false;
		}

	}
	
}
