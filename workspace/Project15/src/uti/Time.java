package uti;

public class Time {
	private long hours;
	private long minutes;
	private long seconds;
	
	public Time () {
		
	}
	
	public Time (long miliseconds) {
		this.seconds = ((miliseconds / 1000) % 60);
		this.minutes = ((miliseconds / (1000 * 60)) % 60);
		this.hours =  ((miliseconds / (1000 * 60 * 60)) % 24) + 2;
	}
	
	public Time (int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public void setTime (long elapseTime) {
		this.seconds = ((elapseTime / 1000) % 60);
		this.minutes = ((elapseTime / (1000 * 60)) % 60);
		this.hours = ((elapseTime / (1000 * 60 * 60)) % 24) + 2;
	}
	
	public long getHours() {
		return hours;
	}

	public long getMinutes() {
		return minutes;
	}

	public long getSeconds() {
		return seconds;
	}
	
	
}
