
public class Driver_10_1 {

	public static void main(String[] args) {
		Time system = new Time();
		Time set =  new Time(555550000);
		
		System.out.println("The Current time is " + system.getHours() + ":" + system.getMinutes() + ":" + system.getSeconds() + " UTC");
		System.out.println("The Set time is " + set.getHours() + ":" + set.getMinutes() + ":" + set.getSeconds());

	}

}
