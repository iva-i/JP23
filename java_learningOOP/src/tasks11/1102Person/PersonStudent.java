package tasks11;

public class PersonStudent extends Person {

	private int classStatus;
	private final int FRESHMAN = 1;
	private final int SOPHMORE = 2;
	private final int JUNIOR = 3;
	private final int SENIOR = 4;

	public PersonStudent() {
	}
	
	public PersonStudent(String name) {
		super(name);
	}

	public PersonStudent(int classStatus) {
		if (classStatus == FRESHMAN || classStatus == SOPHMORE || classStatus == JUNIOR || classStatus == SENIOR) {
			this.classStatus = classStatus;
		}else {
			System.out.println("Invalid status!");
		}
	}

	public int getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(int classStatus) {
		this.classStatus = classStatus;
	}
	
	@Override
	public String toString() {
		return "Person's name is " + getName() + " and name of the class is " + this.getClass().getName();
	}	

}
