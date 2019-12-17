
public class TestH {
	public static void main(String[] args) {
		FirstGen f = new FirstGen();
		f.msg();
		f.call();
		System.out.println("********************");

		SecondGen s = new SecondGen();
		s.msg();
		s.call();
		s.games();
		System.out.println("***********************");

		ThirdGen th = new ThirdGen();
		th.msg();
		th.call();
		th.games();
		th.camera();
	}

}
