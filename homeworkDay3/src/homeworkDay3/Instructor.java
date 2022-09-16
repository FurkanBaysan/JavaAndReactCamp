package homeworkDay3;

public class Instructor extends User {

	private String details;

	public Instructor() {

	}

	public Instructor(int id, String password, String instructorFirstName, String instructorLastName, String email) {
		this.id = id;
		this.password = password;
		this.firstName = instructorFirstName;
		this.lastName = instructorLastName;
		this.email = email;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
