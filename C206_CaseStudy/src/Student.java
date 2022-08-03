
public class Student {

	private String name;
	private String NRIC;

	public Student(String name, String NRIC) {
		this.name = name;
		this.NRIC = NRIC;
	}

	public String getName() {
		return name;
	}

	public String getStudentID() {
		return NRIC;
	}
}
