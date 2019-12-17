
public class TestC {
	public static void main(String[] args) {
		Person.color = "white";
		Person.sleep();
		System.out.println("Person color " + Person.color);

		Person p1 = new Person();
		p1.age = 21;
		p1.name = "Sumiya";
		System.out.println("Person p1 age is " + p1.age);
		System.out.println("Person p1 name is " + p1.name);
		p1.color = "black";
		p1.sleep();
		p1.eat();
		p1.walk();

		System.out.println("************************");
		Person p2 = new Person();
		p2.age = 22;
		p2.name = "Bushra";
		System.out.println("person p2 age is " + p2.age);
		System.out.println("person p2 name is " + p2.name);

	}
}
