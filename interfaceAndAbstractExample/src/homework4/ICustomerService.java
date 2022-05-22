package homework4;

import java.rmi.RemoteException;

public interface ICustomerService {
	void save(Customer customer) throws NumberFormatException, RemoteException;
	void delete(Customer customer);
	void update(Customer customer);
}
