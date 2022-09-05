package inheritancePart2;

public class CustomerManager {

	private BaseLogger logger;

	public CustomerManager() {

	}

	// Second Way
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}

	// First Way
	public void add(Customer customer, BaseLogger logger) {
		System.out.println(customer.customerNumber + " inserted to the database");
		// ..
		logger.log();
	}

	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " inserted to the database");
		// ..
		this.logger.log();
	}

}
