import java.util.Scanner;

/**
 * @author Armando Dollia
 * dollia.armando@gmail.com
 *
 */

public class FutureDates_3_5 {

	public static void main(String[] args) {
		int dayNow, dayFuture, mod;
		String now = "", future = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day: ");
		dayNow = input.nextInt();
		System.out.println("Enter enter the number of days elapsed since today: ");
		dayFuture = input.nextInt();
		dayFuture += dayNow;
		mod = dayFuture % 7;
		
		switch(dayNow){
		case 0:
			now = "Sunday";
			break;
		case 1:
			now = "Monday";
			break;
		case 2:
			now = "Tuesday";
			break;
		case 3:
			now = "Wednesday";
			break;
		case 4:
			now = "Thursday";
			break;
		case 5:
			now = "Friday";
			break;
		case 6:
			now = "Saturday";
			break;
		}
		
		switch(mod){
		case 0:
			future = "Sunday";
			break;
		case 1:
			future = "Monday";
			break;
		case 2:
			future = "Tuesday";
			break;
		case 3:
			future = "Wednesday";
			break;
		case 4:
			future = "Thursday";
			break;
		case 5:
			future = "Friday";
			break;
		case 6:
			future = "Saturday";
			break;
		}
		
		System.out.println("Today is " + now + " and the future day is " + future);

		input.close();

	}


}
