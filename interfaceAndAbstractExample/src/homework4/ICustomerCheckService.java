package homework4;

import java.rmi.RemoteException;

public interface ICustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
	
}
