package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " inserted to the database");
	}

	// Bulk insert
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			this.add(customer);
		}
	}

}
