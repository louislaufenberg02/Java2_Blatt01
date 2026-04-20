package a4;

public class Book implements Discountable {
	private double price;
	
	public Book (double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
