package homework5ECommerce.core.abstracts;

import homework5ECommerce.entities.concretes.Customer;

public interface EmailService {
	boolean validator(Customer customer);
	
}
