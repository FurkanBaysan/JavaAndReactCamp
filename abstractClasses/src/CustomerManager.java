public class CustomerManager {
    BaseDatabaseManager baseDatabaseManager; // Dependency

    public CustomerManager(BaseDatabaseManager baseDatabaseManager) { // Dependency Injection
        this.baseDatabaseManager = baseDatabaseManager;
    }

    public void getCustomers() {
        this.baseDatabaseManager.getData();
    }
}
