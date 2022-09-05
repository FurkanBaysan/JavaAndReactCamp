package inheritancePart2;

public class Main {

	public static void main(String[] args) {

		BaseLogger firstLogger = new FileLogger();
		firstLogger.log();

		BaseLogger secondLogger = new DatabaseLogger();
		secondLogger.log();

		BaseLogger thirdLogger = new EmailLogger();
		thirdLogger.log();

		System.out.println();

		BaseLogger[] loggers = { firstLogger, secondLogger, thirdLogger };

		for (BaseLogger logger : loggers) {
			logger.log();
		}
		System.out.println();

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.customerNumber = "1234";

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.customerNumber = "5678";

		// First Way
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(individualCustomer, secondLogger);

		System.out.println();

		// Second Way
		CustomerManager manager = new CustomerManager(thirdLogger);
		manager.add(corporateCustomer);
	}

}
