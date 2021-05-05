package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerService;
	
	public StarbucksCustomerManager(CustomerCheckService customerService) {
		this.customerService=customerService;
	}
	
	@Override
	public void Save(Customer customer){
		if(customerService.checkIfRealPerson(customer)) {
			System.out.println("Save to db starbucks:"+customer.getFirstName());
			
		}else {
			System.out.println("not a valid person");
		}
	}
}
