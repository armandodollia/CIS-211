import java.util.GregorianCalendar;


public class Calendar_9_5 {

	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		GregorianCalendar calendar1 = new GregorianCalendar();

		System.out.println("Current date " + calendar.get(GregorianCalendar.MONTH)+1 + "-" + calendar.get(GregorianCalendar.DAY_OF_MONTH) + "-" + calendar.get(GregorianCalendar.YEAR));
		calendar1.setTimeInMillis(1234567898765L);
		System.out.println("1234567898765L millis from 1-1-1970 = " + calendar1.get(GregorianCalendar.MONTH)+1 + "-" + calendar1.get(GregorianCalendar.DAY_OF_MONTH) + "-" + calendar1.get(GregorianCalendar.YEAR));
	}


}
