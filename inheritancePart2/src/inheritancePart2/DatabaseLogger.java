package inheritancePart2;

public class DatabaseLogger extends BaseLogger {
    @Override
    public void log() {
        System.out.println("Logged to the database");
    }
}
