package a4;

public class A4_main {
	public static void main(String[] args) {
		Discountable b1 = new Book(50.0);
		Discountable e1 = new Electronic(100.0);

		System.out.println(b1.getPrice() + " | " + b1.getDiscountPrice()); // 50 | 45
		System.out.println(e1.getPrice() + " | " + e1.getDiscountPrice()); // 100 | 80
		
		Discountable b2 = new Book(100.0);
		Discountable e2 = new Electronic(100.0);

		System.out.println(b2.getDiscountPrice()); // 90.0
		System.out.println(e2.getDiscountPrice()); // 80.0
		
		Discountable b3 = new Book(0.0);
		Discountable e3 = new Electronic(0.0);

		System.out.println(b3.getDiscountPrice()); // 0
		System.out.println(e3.getDiscountPrice()); // 0
	}
}
