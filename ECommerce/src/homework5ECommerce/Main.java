package homework5ECommerce;

import java.util.regex.Pattern;

import homework5ECommerce.business.abstracts.CustomerService;
import homework5ECommerce.business.abstracts.LoginService;
import homework5ECommerce.business.concretes.CustomerManager;
import homework5ECommerce.business.concretes.LoginManager;
import homework5ECommerce.core.concretes.EmailLogger;
import homework5ECommerce.core.concretes.EmailValidator;
import homework5ECommerce.core.concretes.GoogleAuthenticatorAdapter;
import homework5ECommerce.dataAccess.concretes.HibernateCustomerDao;
import homework5ECommerce.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Recep", "Cantekin", 
				"recep_@hotmail.com", "123");
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao(),
				new EmailValidator(),new EmailLogger());
		customerService.memberAdd(customer);
		Customer customer1 = new Customer(1, "Er", "Cantekin", 
				"recep_a@hotmail.com", "123456");
		customerService.memberAdd(customer1);
		
		CustomerService customerService1 = new CustomerManager(new GoogleAuthenticatorAdapter(),
				new EmailLogger());
		
		customerService1.memberAddWithGoogle("recep_@gmail.com","12345");
		
		LoginService loginService = new LoginManager(new HibernateCustomerDao());
		loginService.login(customer1.getEmail(), customer1.getPassport());
		loginService.login("recep@gmail.com", "123456");
		
	}

}
