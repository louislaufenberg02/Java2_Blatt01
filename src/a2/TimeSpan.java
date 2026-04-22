package a2;

public class TimeSpan implements TimeUnit {
	private Hours hours;
	private Minutes minutes;
	private Seconds seconds;
	
	//Konstruktor
	public TimeSpan (int hours, int minutes, int seconds) {
		this.hours = new Hours(hours);
		this.minutes = new Minutes(minutes);
		this.seconds = new Seconds(seconds);
	}
	
	//Insgesamte Sekundenanzahl von TimeSpan
	@Override
	public int getSeconds() {
		return this.hours.getSeconds() + this.minutes.getSeconds() + this.seconds.getSeconds();
	}
	
	//Getters und Setters
	public Hours getHours() {
		return hours;
	}

	public void setHours(Hours hours) {
		this.hours = hours;
	}

	public Minutes getMinutes() {
		return minutes;
	}

	public void setMinutes(Minutes minutes) {
		this.minutes = minutes;
	}

	public void setSeconds(Seconds seconds) {
		this.seconds = seconds;
	}
}
