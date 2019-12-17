
public class TestD {
	public static void main(String[] args) {
		BTM b = new BTM();
		b.swipe();
		int count = b.getCount();
		System.out.println("count is " + count);
		int totalCount = b.getTotalCount();
		System.out.println("Totalmcount is " + totalCount);

	}

}
