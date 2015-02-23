import java.util.Scanner;

/**
 * @author Armando Dollia
 * dollia.armando@gmail.com
 *
 */

public class RootChecker_3_1 {

	public static void main(String[] args) {
		Double a, b, c, discriminant;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a:");
		a = input.nextDouble();
		System.out.println("Input b:");
		b = input.nextDouble();
		System.out.println("Input c:");
		c = input.nextDouble();
		
		discriminant = Math.pow(b, 2.0) - (4.0 * a * c);
		
		if (discriminant == 0){
			System.out.println("The equation has one root " + (((-b) + Math.pow((Math.pow(b, 2.0) - (4.0 * a * c)), 0.5)) / (2.0 * a)));
		}
		else if (discriminant > 0){
			System.out.println("The equation has two roots " + (((-1.0 *b) + Math.pow((Math.pow(b, 2.0) - (4.0 * a * c)), 0.5)) / (2.0 * a)) + " and " 
								+ (((-1.0 *b) - Math.pow((Math.pow(b, 2.0) - (4.0 * a * c)), .5)) / (2.0 * a)));
		}
		else if (discriminant < 0){
			System.out.println("The equation has no real roots");
		}
		

		input.close();


	}

}
