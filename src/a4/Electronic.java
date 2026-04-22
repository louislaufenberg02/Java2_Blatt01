package a4;

public class Electronic implements Discountable {
	private double price;
	
	public Electronic (double price) {
		this.price = price;
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public double getDiscountPrice() {
		return getPrice() * 0.8;
	}
}
