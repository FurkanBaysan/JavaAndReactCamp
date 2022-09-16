package homeworkDay3;

import java.text.DecimalFormat;

public class Student extends User {
	private int studentNumber;
	private double numberOfVideosWatched;
	private double courseCompletionRate;

	public Student() {

	}

	public Student(int id, String password, String firstName, String lastName) {
		this.id = id;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Student(int id, String password, String firstName, String lastName, String email, int studentNumber) {
		this.id = id;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber() {
		return this.studentNumber;
	}

	public double getNumberOfVideosWatched() {
		return this.numberOfVideosWatched;
	}

	public void setNumberOfVideosWatched(int numberOfVideosWatched) {
		this.numberOfVideosWatched = numberOfVideosWatched;
	}

	public String getCourseCompletionRate(Course course) {
		this.courseCompletionRate = (this.numberOfVideosWatched / course.numberOfVideos);
		DecimalFormat decimalFormat = new DecimalFormat("#%");
		return decimalFormat.format(this.courseCompletionRate);
		// return this.courseCompletionRate;
	}

}
