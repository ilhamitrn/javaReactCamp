package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) throws NumberFormatException, RemoteException {

		if (customerCheckService.checkIfRealPerson(customer)) {
			
			System.out.println("Saved to DB : " + customer.getFirstName());
		} else {
			System.out.println("Not a valid person");

		}

	}
}
