
public class TestA {
	public static int add(int a, int b) {
		System.out.println("add(int a,int b) method");
		return a + b;
	}

	public static int add(byte a, byte b) {
		System.out.println("add(int a,int b) method");
		return a + b;
	}

	public int multiple(byte a, int b) {
		System.out.println("multiple(byte a,int b) method");
		return a * b;
	}

	public int multiple(int a, int b) {
		System.out.println("multiple(int a,int b) method");
		return a * b;
	}

	public static void main(String[] args) {
		System.out.println("main(string[] args)");
		main(10);
		add(10, 12);
		add(12, 34);
		add(98, 56);
		TestA t = new TestA();
		t.multiple(12, 23);
		t.multiple(12, 45);
	}

	public static void main(int a) {
		System.out.println("main(int a) method");
	}
}
