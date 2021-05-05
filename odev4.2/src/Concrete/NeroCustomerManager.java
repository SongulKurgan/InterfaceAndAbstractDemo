package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerService;
	
	public NeroCustomerManager(CustomerCheckService customerService) {
		this.customerService=customerService;
	}
	
	@Override
	public void Save(Customer customer){
		if(customerService.checkIfRealPerson(customer)) {
			System.out.println("Save to db nero:"+customer.getFirstName());
			
		}else {
			System.out.println("not a valid person");
		}
	}
}
