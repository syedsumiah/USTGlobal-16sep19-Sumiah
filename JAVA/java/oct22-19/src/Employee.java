
public class Employee {
	String name;
	int eid;

	public Employee(String empname, int eeid) {
		name = empname;
		eid = eeid;
	}

	void printDetails() {
		System.out.println("employee name is " + name);
		System.out.println("employee eid is " + eid);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("rashmika", 222);
		e1.printDetails();
		Employee e2 = new Employee("Genellia", 143);
		e2.printDetails();
		Employee e3 = new Employee("Ramcharan", 495);
		e3.printDetails();

	}
}