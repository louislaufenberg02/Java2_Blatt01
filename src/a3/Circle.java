package a3;

public class Circle implements Shape{
	private double radius;
	
	public Circle (double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return this.radius *this.radius * Shape.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
