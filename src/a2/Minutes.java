package a2;

public class Minutes implements TimeUnit {
	private int minutes;
	
	//Konstruktor
	public Minutes (int minutes) {
		this.minutes = minutes;
	}
	
	//getSeconds Methode
	public int getSeconds() {
		return minutes * 60;
	}
	
	//Getters und Setters
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int hours) {
		this.minutes = hours;
	}
}