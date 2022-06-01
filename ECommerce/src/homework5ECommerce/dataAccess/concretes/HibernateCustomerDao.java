package homework5ECommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework5ECommerce.dataAccess.abstracts.CustomerDao;
import homework5ECommerce.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{

	List<Customer> customerList = new ArrayList<Customer>();
	
	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " was added to the database with Hibernate.");
		this.customerList.add(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " was deleted from the database with Hibernate.");
		this.customerList.remove(customer);
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " was updated in the database with Hibernate.");
		this.customerList.add(customer);
	}


	@Override
	public List<Customer> getAll() {
		return customerList;
	}

}
