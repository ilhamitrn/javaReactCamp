import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		BaseCustomerManager customerService=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerService.save(new Customer(1,"İLHAMİ","TURAN",1995,"30566046236"));
		

	}
}


