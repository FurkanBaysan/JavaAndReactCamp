package inheritancePart2;

public class FileLogger extends BaseLogger {
    @Override
    public void log() {
        System.out.println("Logged to the file");
    }
}
