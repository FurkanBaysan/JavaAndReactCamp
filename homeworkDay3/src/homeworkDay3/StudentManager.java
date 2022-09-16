package homeworkDay3;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Student added to the database: " + " " + user.firstName + " " + user.lastName);
	}

	@Override
	public void addMultiple(User[] users) {
		for (User user : users) {
			this.add(user);
		}
	}

	@Override
	public void remove(User user) {
		System.out.println("Student removed from the database: " + " " + user.firstName + " " + user.lastName);
	}

	@Override
	public void update(User user) {
		System.out.println("Student updated in the database: " + " " + user.firstName + " " + user.lastName);
	}

	public void registerToTheCourse(Student student) {
		System.out.println(student.firstName + " " + student.lastName + "enrolled to the Course");
	}

}
