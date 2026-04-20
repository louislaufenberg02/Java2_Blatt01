package a2;

public class Seconds implements TimeUnit {
	private int seconds;
	
	//Konstruktor
	public Seconds (int seconds) {
		this.seconds = seconds;
	}
	
	//getSeconds Methode
	
	//Getters und Setters
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
}
