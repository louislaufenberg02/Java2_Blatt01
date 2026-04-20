package a4;

public interface Discountable {
	double DEFAULT_DISCOUNT = 0.1;
	double getPrice();
	default double getDiscountPrice() {
		return getPrice() * (1 - DEFAULT_DISCOUNT);
	}
}
