
public class Admin {

	private String name;
	private String adminID;
	private String password;

	public Admin(String name, String adminID, String password) {
		this.name = name;
		this.adminID = adminID;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getAdminID() {
		return adminID;
	}
}
