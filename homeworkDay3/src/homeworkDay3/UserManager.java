package homeworkDay3;

public class UserManager {
	public void add(User user) {
		System.out.println(" User added to the database" + user.firstName + " " + user.lastName);
	}

	// Bulk insert
	public void addMultiple(User[] users) {
		for (User user : users) {
			this.add(user);
		}
	}

	public void remove(User user) {
		System.out.println("User removed from database" + user.firstName + " " + user.lastName);
	}

	public void update(User user) {
		System.out.println("User updated in the database" + user.firstName + " " + user.lastName);
	}
}
