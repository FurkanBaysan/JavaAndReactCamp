package inheritancePart2;

public class EmailLogger extends BaseLogger {
    @Override
    public void log() {
        System.out.println("E-Mail has been sent");
    }
}
