
public class Factorial {
	static int fact(int n) {
		if (n == 1 | n == 0) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static void main(String[] args) {

		int res = fact(3);
		System.out.println("res =" + res);
	}

}
