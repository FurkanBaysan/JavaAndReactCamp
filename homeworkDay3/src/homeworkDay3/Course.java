package homeworkDay3;

public class Course {
	private String courseName;
	private String courseLanguge;
	private boolean isSubtitle;
	private double discountRate;
	private int numberOfVideos;
	private int numberOfRegisteredStudents;

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseLanguge() {
		return this.courseLanguge;
	}

	public void setCourseLanguge(String courseLanguge) {
		this.courseLanguge = courseLanguge;
	}

	public boolean isSubtitle() {
		return this.isSubtitle;
	}

	public void setSubtitle(boolean isSubtitle) {
		this.isSubtitle = isSubtitle;
	}

	public double getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public int getNumberOfVideos() {
		return this.numberOfVideos;
	}

	public void setNumberOfVideos(int numberOfVideos) {
		this.numberOfVideos = numberOfVideos;
	}

	public int getNumberOfRegisteredStudents() {
		return this.numberOfRegisteredStudents;
	}

	public void setNumberOfRegisteredStudents(int numberOfRegisteredStudents) {
		this.numberOfRegisteredStudents = numberOfRegisteredStudents;
	}

}
