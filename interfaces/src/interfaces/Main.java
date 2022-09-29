package interfaces;

public class Main {

	public static void main(String[] args) {
		Customer firstCustomer = new Customer(1, "Furkan", "Baysan");
		Customer secondCustomer = new Customer(2, "Velihan", "Gozek");
		// CustomerManager customerManager = new CustomerManager(new EmailLogger());

		Logger[] loggers = { new DatabaseLogger(), new SmsLogger(), new EmailLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);

		customerManager.add(firstCustomer);
		System.out.println();
		customerManager.add(secondCustomer);
		System.out.println();
		customerManager.delete(secondCustomer);

	}

}
