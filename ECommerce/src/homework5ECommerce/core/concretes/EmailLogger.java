package homework5ECommerce.core.concretes;

import java.util.Scanner;

import homework5ECommerce.core.abstracts.LoggerService;
import homework5ECommerce.entities.concretes.Customer;

public class EmailLogger implements LoggerService{

	@Override
	public void verify(String message) {
		
		System.out.println("A verification link has been sent to the e-mail. \n");
		
		Scanner confirm = new Scanner(System.in);
		int input = confirm.nextInt();
		
		if(input == 1) {
			System.out.println(message + " successfully registered!" + "\n");
		}else {
			System.out.println(message + " failed to register! Try again." + "\n");
		}
		
	}

}
