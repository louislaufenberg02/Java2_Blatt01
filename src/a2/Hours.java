package a2;

public class Hours implements TimeUnit {
	private int hours;
	
	//Konstruktor
	public Hours (int hours) {
		this.hours = hours;
	}
	
	//getSeconds Methode
	@Override
	public int getSeconds() {
		return hours * 3600;
	}
	
	//Getters und Setters
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
}
