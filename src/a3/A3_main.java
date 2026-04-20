package a3;

public class A3_main {
	public static void main(String[] args) {
		Shape kreis = createShape('c', 2.0, 0);
		System.out.println(kreis.getArea());
		Shape rechteck = createShape('r', 3.0, 4.0);
		System.out.println(rechteck.getArea());
	}
	
	public static Shape createShape(char type, double a, double b) {
		if(type == 'c') {
			Shape x = new Circle(a);
			return x;
		}
		if( type == 'r') {
			Shape x = new Rectangle(a,b);
			return x;
		}
		return null;
	}
}
