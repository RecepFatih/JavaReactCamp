package homework5ECommerce.core.concretes;

import java.util.regex.Pattern;

import homework5ECommerce.core.abstracts.EmailService;
import homework5ECommerce.entities.concretes.Customer;

public class EmailValidator implements EmailService{

	@Override
	public boolean validator(Customer customer) {
		
		if(customer.getEmail() == null || customer.getEmail().isEmpty()) {
			return false;
		}
		
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
				"[a-zA-Z0-9_+&*-]+)*@"+
				"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex);
					
		if(pattern.matcher(customer.getEmail()).matches()) {
			return true;
		}else {
			return false;
		}
	}

	
}
