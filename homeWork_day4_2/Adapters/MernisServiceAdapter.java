package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {
	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {

		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		if (result == true) {
			return true;

		} else {
			return false;
		}

	}

}