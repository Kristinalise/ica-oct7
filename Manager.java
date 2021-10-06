package for_workers;
	
//import java.util.ArrayList;
public class Manager {
		
	//private ArrayList<?> employees = new ArrayList<>();
	private String name;
	private String role;
	private int salary;

	public Manager (String theName, String theRole, int theSalary){
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
