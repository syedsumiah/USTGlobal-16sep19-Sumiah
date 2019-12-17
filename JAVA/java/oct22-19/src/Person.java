
public class Person {
	String name;
	int age;
	String color;

	Person(String pname, int page, String pcolor) {
		name = pname;
		age = page;
		color = pcolor;
	}

	void printDetails() {
		System.out.println("persom name is " + name);
		System.out.println("Person age is " + age);
		System.out.println("person color is " + color);
	}

	public static void main(String[] args) {

		Person p = new Person("Sumiya", 21, "white");
		p.printDetails();
	}
}
