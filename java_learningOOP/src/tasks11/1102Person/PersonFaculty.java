package tasks11;

public class PersonFaculty extends PersonEmployee {
	
	private double officeHours;
	private int rank;
	
	public PersonFaculty() {
		super();
	}
	
	public PersonFaculty(String name) {
		super(name);
	}
	
	public PersonFaculty(double officeHours, int rank) {
		super();
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public double getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(double officeHours) {
		this.officeHours = officeHours;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Person's name is " + getName() + " and name of the class is " + this.getClass().getName();
	}
	

}
