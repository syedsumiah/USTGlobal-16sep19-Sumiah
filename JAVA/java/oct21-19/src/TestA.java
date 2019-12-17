
public class TestA {
	public static void main(String[] args) {

		Pen p = new Pen();

		p.cost = 100;
		p.color = "blue";
		p.brand = "Cello";

		System.out.println("cost is " + p.cost);
		System.out.println("color is " + p.color);
		System.out.println("Brand is " + p.brand);

		p.write();

		System.out.println("************************************");

		Van v = new Van();

		v.cost = 2500000;
		v.color = "black";

		System.out.println("Van cost is " + v.cost);
		System.out.println("van color is " + v.color);
		v.move();

		Van v1 = new Van();
		v1.cost = 5000000;
		v1.color = "white";
		System.out.println("van  v1 cost is " + v1.cost);
		System.out.println("van  v1 color is " + v1.color);
		v1.move();
	}
}
