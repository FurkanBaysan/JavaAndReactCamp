package homeworkDay3;

public class UserManager {
	public void add(User user) {
		System.out.println(" User added to the database" + user.getFirstName() + " " + user.getLastName());
	}

	// Bulk insert
	public void addMultiple(User[] users) {
		for (User user : users) {
			this.add(user);
		}
	}

	public void remove(User user) {
		System.out.println("User removed from database" + user.getFirstName() + " " + user.getLastName());
	}

	public void update(User user) {
		System.out.println("User updated in the database" + user.getFirstName() + " " + user.getLastName());
	}
}
