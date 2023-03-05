public class Main {
    public static void main(String[] args) {
        BaseDatabaseManager databaseManager = new MongoDbDatabaseManager();
        CustomerManager customerManager = new CustomerManager(databaseManager);
        customerManager.getCustomers();
    }
}