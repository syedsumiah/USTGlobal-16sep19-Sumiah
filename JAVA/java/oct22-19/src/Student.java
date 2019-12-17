
public class Student {
	String name;
	int rollNo;
	String branch;
	static String clg = "MTIET";
	long pno;

	Student(String name, int rollNo, String branch, long pno) {
		this.name = name;
		this.rollNo = rollNo;
		this.branch = branch;
		this.pno = pno;
	}

	void printStudentDetails() {
		System.out.println("Student name is " + name);
		System.out.println("Student rollNo is " + rollNo);
		System.out.println("Student branch name is " + branch);
		System.out.println("Student college name is " + Student.clg);
		System.out.println("Student phoneNo is " + pno);
	}

	public static void main(String[] args) {
		Student s1 = new Student("Sumiya", 495, "ECE", 987650210);
		s1.printStudentDetails();
		Student s2 = new Student("Bushra", 496, "EEE", 985245264);
		s2.printStudentDetails();
		Student s3 = new Student("UmaPriya", 413, "ECE", 964535345);
		s3.printStudentDetails();
		Student s4 = new Student("Lahari", 497, "ECE", 4568434);
		s4.printStudentDetails();
		Student s5 = new Student("Afzal", 420, "MECH", 999990210);
		s5.printStudentDetails();
		Student s6 = new Student("Nagarjuna", 466, "EEE", 987777770);
		s6.printStudentDetails();
		Student s7 = new Student("Bhanu Sandhya", 496, "ECE", 999999210);
		s7.printStudentDetails();
		Student s8 = new Student("Asma", 495, "CSE", 777750210);
		s8.printStudentDetails();
		Student s9 = new Student("Arshiya", 499, "ECE", 66660210);
		s9.printStudentDetails();
		Student s10 = new Student("Shajahan", 475, "ECE", 88850210);
		s10.printStudentDetails();

	}

}
