package homework4;

import java.rmi.RemoteException;


public abstract class CustomerManager implements ICustomerService{

	private ICustomerCheckService checkService;
	
	
	public CustomerManager(ICustomerCheckService checkService) {
	
		this.checkService = checkService;
	}
	

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		if(checkService.checkIfRealPerson(customer)) {
			System.out.println("Registration Successful! Gamer name is : " + customer.getFirstName());
		}else {
			System.out.println("Not a valid person! Identity information is incorrect!");
		}
				
	}

	@Override
	public void delete(Customer customer) {
		
		System.out.println(customer.getFirstName() + " has been deleted. We are sorry that we lost our player.");
		customer = null;
	}

	@Override
	public void update(Customer customer) {
		
		System.out.println("Player information has been updated!");
		
	}

}
