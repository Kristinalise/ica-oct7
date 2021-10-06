package for_workers;

public class Fulltimer {

	private String name;
	private String role;
	private int salary;

	public Fulltimer (String theName, String theRole, int theSalary){
		name = theName;
		role = theRole;
		salary = theSalary;
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
		return salary;
	}	
}
