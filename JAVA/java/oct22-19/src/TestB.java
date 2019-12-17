
public class TestB {

	static int a = 22;
	int x;

	public static void add() {
		final int a;// only final access modifier is supported for local modifier
		int b;
		a = 10;
		b = 20;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		add();
		TestB t = new TestB();
		System.out.println("x value is " + t.x);
	}
}
