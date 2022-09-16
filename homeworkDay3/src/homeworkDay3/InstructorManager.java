package homeworkDay3;

public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Instructor added to the database: " + user.firstName + " " + user.lastName);
	}

	@Override
	public void addMultiple(User[] users) {
		for (User user : users) {
			this.add(user);
		}
	}

	@Override
	public void remove(User user) {
		System.out.println("Instructor removed from the database: " + user.firstName + " " + user.lastName);
	}

	@Override
	public void update(User user) {
		System.out.println("Instructor updated in the database: " + user.firstName + " " + user.lastName);
	}
}
