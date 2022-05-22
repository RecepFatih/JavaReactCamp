package concrete;

import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	ICustomerCheckService checkService;
	
	public StarbucksCustomerManager(ICustomerCheckService checkService) {
	
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		
		if(checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person!");
		}
		
		
	}
	
}
