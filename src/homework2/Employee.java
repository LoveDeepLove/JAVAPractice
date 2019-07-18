package homework2;

public class Employee {
	int ID;
	String name;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + "]";
	}
	

}
