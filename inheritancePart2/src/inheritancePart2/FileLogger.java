package inheritancePart2;

public class FileLogger extends BaseLogger {
	@Override
	public void log() {
		System.out.println("Dosyaya loglandý");
	}
}
