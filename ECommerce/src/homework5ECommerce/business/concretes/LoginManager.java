package homework5ECommerce.business.concretes;

import java.util.List;

import homework5ECommerce.business.abstracts.LoginService;
import homework5ECommerce.dataAccess.abstracts.CustomerDao;
import homework5ECommerce.entities.concretes.Customer;

public class LoginManager implements LoginService{

	private CustomerDao customerDao;
	
	public LoginManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Override
	public void login(String email, String password) {
		
		
		for(Customer customer : this.customerDao.getAll()) {
			System.out.println("Invalid email or password!");
			if(customer.getEmail() == email || customer.getPassport() == password) {
				System.out.println(customer.getFirstName() + " successful.");
			}
			else {
				System.out.println("Invalid email or password!");
			}
		}
		//System.out.println("Invalid email or password!");
		
	}

}
