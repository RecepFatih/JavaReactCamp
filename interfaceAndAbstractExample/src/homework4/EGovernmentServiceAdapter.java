package homework4;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class EGovernmentServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), 
				customer.getDateOfBirth());
	}
	
}
