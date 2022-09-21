package homeworkDay3;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Student added to the database: " + " " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void addMultiple(User[] users) {
		for (User user : users) {
			this.add(user);
		}
	}

	@Override
	public void remove(User user) {
		System.out.println("Student removed from the database: " + " " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void update(User user) {
		System.out.println("Student updated in the database: " + " " + user.getFirstName() + " " + user.getLastName());
	}

	public void registerToTheCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + "enrolled to the Course");
	}

}
