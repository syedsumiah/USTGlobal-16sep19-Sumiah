
public class TestB {

	int a;
	static int b;
	{
		a = 10;
		b = 20;
		System.out.println("non static block 1 ");
	}

	public static void main(String[] args) {
		System.out.println("main started");
		TestB b = new TestB();
		TestB b1 = new TestB();
		System.out.println("main ended");
		System.out.println("a value is " + b.a);
	}

	{
		a = 40;
		System.out.println("non static block 2");
	}
}
