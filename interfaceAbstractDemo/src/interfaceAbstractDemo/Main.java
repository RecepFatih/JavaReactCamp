package interfaceAbstractDemo;

import java.rmi.RemoteException;
import java.sql.Date;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.CustomerCheckManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;


public class Main {

	public static void main(String[] args)  {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "RECEP FATÝH", "CANTEKÝN", 1996 , 231512));
		
		
	}

	
}
