
public class Account extends Student{

	private String password;
	private double dailyAmountLimit;

	public Account(String name, String NRIC, String password) {
		super(name, NRIC);
		this.password = password;
		dailyAmountLimit = 0.0;
	}
	
	public Account(String name, String NRIC, String password, double dailyAmountLimit) {
		super(name, NRIC);
		this.password = password;
		this.dailyAmountLimit = dailyAmountLimit;

	}
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public double getdailyAmountLimit() {
		return dailyAmountLimit;
	}
}
