package homework5ECommerce.business.concretes;

import java.util.List;

import homework5ECommerce.business.abstracts.CustomerService;
import homework5ECommerce.core.abstracts.EmailService;
import homework5ECommerce.core.abstracts.LoggerService;
import homework5ECommerce.core.concretes.EmailLogger;
import homework5ECommerce.dataAccess.abstracts.CustomerDao;
import homework5ECommerce.entities.concretes.Customer;

public class CustomerManager implements CustomerService{

	private CustomerDao customerDao;
	private EmailService emailService;
	private LoggerService loggerService;
	
	
	public CustomerManager(CustomerDao customerDao, EmailService emailService,
			LoggerService loggerService) {
		super();
		this.customerDao = customerDao;
		this.emailService = emailService;
		this.loggerService = loggerService;
	}

	@Override
	public void memberAdd(Customer customer) {
		
		if(customer.getPassport().length() <= 5 || emailService.validator(customer) == false) {
			System.out.println("Invalid password or email!" + "\n");
			return;
		}
		
		for(Customer user:this.customerDao.getAll()) {
			if(user.getEmail() == customer.getEmail()) {
				System.out.println("Email has been used before." + "\n");
				return;
			};
		}
		
		if(customer.getFirstName().length() <= 1 || customer.getFirstName().length() <= 1) {
			System.out.println("Invalid name or surname!" + "\n");
			return;
		}
			
		
		this.loggerService.verify(customer.getFirstName());
		this.customerDao.add(customer);
		
		}
		
		
	@Override
	public void memberDelete(Customer customer) {
		customerDao.delete(customer);
		
	}

	@Override
	public void memberUpdate(Customer customer) {
		
		
	}

	@Override
	public List<Customer> getAll() {
		
		return null;
	}

}
