package for_workers;

public class Contractor {

	private String name;
	private String role;
	private int hourlyRate = 50;
	private int numHours = 1000;

	public Contractor (String theName, String theRole){
		name = theName;
		role = theRole;
	}

	public String getName(){
		return name;
	}

	public String getRole(){
		return role;
	}

	public void setName(String theNewName){
		name = theNewName;
	}

	public void setRole(String theNewRole){
		role = theNewRole;
	}

	public int getSalary() {
		return hourlyRate * numHours;
	}
	
}
