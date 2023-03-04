package inheritancePart2;

public class CustomerManager {

    private BaseLogger logger;


    //It is normally an error if dependency injection is done using this constructor.
    // Since I just show the method injection method as well, I'm keeping this here so that the code doesn't crash.
    // Common usage is constructor injection.
    public CustomerManager() {

    }

    // Second Way
    public CustomerManager(BaseLogger logger) { // Dependency Injection
        this.logger = logger;
    }

    // First Way
    public void add(Customer customer, BaseLogger logger) {
        System.out.println(customer.getCustomerNumber() + " inserted to the database");
        // ..
        logger.log();
    }

    public void add(Customer customer) {
        System.out.println(customer.getCustomerNumber() + " inserted to the database");
        // ..
        this.logger.log();
    }

}
