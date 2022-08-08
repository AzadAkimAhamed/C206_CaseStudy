
public class Account extends Student{

	private String password;
	private double dailyAmountLimit;
	private String email;
	private String ParentID;
	
	

	public Account(String name, int StudentID, String ParentID,String email, String password) {
		super(name,StudentID,password);
		this.email= email;
		this.ParentID= ParentID;
		
	}
	
	
	public String getEmail() {
		return email;
	}

	public String getParentID() {
		return ParentID;
	}
	
	
	
}