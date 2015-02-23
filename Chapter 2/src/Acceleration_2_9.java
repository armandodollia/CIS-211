import java.util.Scanner;

/**
 * @author Armando Dollia
 * dollia.armando@gmail.com
 *
 */

public class Acceleration_2_9 {

	public static void main(String[] args) {
		Double start, end, time;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input Starting Velocity:");
		start = input.nextDouble();
		System.out.println("Input Final Velocity:");
		end = input.nextDouble();
		System.out.println("Input Elapsed Time:");
		time = input.nextDouble();
		
		System.out.println("Average Acceleration = " + (end - start) / time);

		input.close();

	}

}
