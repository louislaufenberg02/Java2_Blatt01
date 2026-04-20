package a2;

public class TimeSpan implements TimeUnit {
	Hours hours;
	Minutes minutes;
	Seconds seconds;
	
	//Konstruktor
	public TimeSpan (int hours, int minutes, int seconds) {
		this.hours = new Hours(hours);
		this.minutes = new Minutes(minutes);
		this.seconds = new Seconds(seconds);
	}
	
	//Insgesamte Sekundenanzahl von TimeSpan
	public int getSeconds() {
		return this.hours.getSeconds() + this.minutes.getSeconds() + this.seconds.getSeconds();
	}
}
