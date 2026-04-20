package a4;

public class A4_main {
	public static void main(String[] args) {
		Discountable eins = new Book(3.0);
		Discountable zwei = new Book(6.0);
		Discountable drei = new Electronics(5.0);
		Discountable vier = new Electronics(8.0);
		
		System.out.println(eins.getPrice() + " | " + eins.getDiscountPrice());
		System.out.println(zwei.getPrice() + " | " + zwei.getDiscountPrice());
		System.out.println(drei.getPrice() + " | " + drei.getDiscountPrice());
		System.out.println(vier.getPrice() + " | " + vier.getDiscountPrice());
	}
}
