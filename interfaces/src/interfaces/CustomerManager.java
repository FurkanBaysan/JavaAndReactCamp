package interfaces;

public class CustomerManager {
    // private Logger logger;
    private Logger[] loggers;

//	public CustomerManager(Logger logger) { // Dependency injection
//		this.logger = logger;
//	}

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer) {
        System.out.println("Musteri Eklendi: " + customer.getFirstName() + " " + customer.getLastName());

        // this.logger.log(customer.getFirstName() + " " + customer.getLastName());

//		for (Logger logger : this.loggers) {
//			logger.log(customer.getFirstName() + " " + customer.getLastName());
//		}
        Utils.runLoggers(this.loggers, customer.getFirstName() + " " + customer.getLastName());
    }

    public void delete(Customer customer) {
        System.out.println("Musteri Silindi: " + customer.getFirstName() + " " + customer.getLastName());

        // this.logger.log(customer.getFirstName() + " " + customer.getLastName());

//		for (Logger logger : this.loggers) {
//			logger.log(customer.getFirstName() + " " + customer.getLastName());
//		}
        Utils.runLoggers(this.loggers, customer.getFirstName() + " " + customer.getLastName());

    }
}
