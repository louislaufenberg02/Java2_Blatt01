package a4;

public class Electronics implements Discountable {
	double price;
	
	public Electronics (double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public double getDiscountPrice() {
		return getPrice() * (1 - 0.2);
	}
}
