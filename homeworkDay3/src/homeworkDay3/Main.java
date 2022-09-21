package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		Student firstStudent = new Student(1, "123", "Burak", "Kose", "burakkose@gmail.com", 9999);
		Student secondStudent = new Student(2, "456", "Anil", "Toprak", "aniltoprak@gmail.com", 8888);

		Instructor firstInstructor = new Instructor(1, "3535", "Furkan", "Baysan",
				"yazilimkonseptlerisorucevap@gmail.com", "Java Certified Instructor");

		Instructor secondInstructor = new Instructor(2, "8787", "Velihan", "Gozek", "velihangozek@hotmail.com",
				"C# Certified Instructor");

		User[] instructorUsers = { firstInstructor, secondInstructor };

		for (User user : instructorUsers) {
			System.out.println("Instructor" + user.getId() + " : " + user.getFirstName() + " " + user.getLastName()
					+ " " + user.getEmail());
		}

		System.out.println(firstInstructor.getDetails());
		System.out.println(secondInstructor.getDetails());

		System.out.println();

		User[] studentUsers = { firstStudent, secondStudent };

		for (User user : studentUsers) {
			System.out.println("Student" + user.getId() + ":" + " " + user.getFirstName() + " " + user.getLastName()
					+ " " + user.getEmail());
		}

		System.out.println(firstStudent.getStudentNumber());
		System.out.println(secondStudent.getStudentNumber());

		System.out.println();

		Course course = new Course();
		course.setNumberOfVideos(100);
		firstStudent.setNumberOfVideosWatched(50);
		System.out.println("Course Completion Rate: " + firstStudent.getCourseCompletionRate(course));

		System.out.println();

		UserManager userManager = new StudentManager();
		// userManager.add(firstStudent);
		userManager.addMultiple(studentUsers);
		userManager.remove(secondStudent);

		System.out.println();

		UserManager manager = new InstructorManager();
		// manager.add(firstInstructor);
		manager.addMultiple(instructorUsers);
		manager.remove(secondInstructor);

	}

}
