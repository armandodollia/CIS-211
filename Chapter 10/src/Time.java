
public class Time {

	private int hours, minutes, seconds;
	private long time;
	
	
	
	public Time(){
		this(System.currentTimeMillis());
	}
	
	public Time(int hours, int minutes, int seconds){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public Time(long time){
		this.time = time;
		seconds = (int) (time / 1000) % 60 ;
		minutes = (int) ((time / (1000*60)) % 60);
		hours   = (int) ((time / (1000*60*60)) % 24);
	}
	
	public void setTime(long time){
		this.time = time;
	}
	
	public int getHours(){
		return hours;
	}
	
	public int getMinutes(){
		return minutes;
	}
	
	public int getSeconds(){
		return seconds;
	}
}
