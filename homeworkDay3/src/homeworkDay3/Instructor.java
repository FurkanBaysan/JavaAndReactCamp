package homeworkDay3;

public class Instructor extends User {

	private String details;

	public Instructor() {

	}

	public Instructor(int id, String password, String instructorFirstName, String instructorLastName, String email,
			String details) {

		super(id, password, instructorFirstName, instructorLastName, email);
		this.details = details;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
