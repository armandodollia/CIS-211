import java.util.Scanner;

/**
 * @author Armando Dollia
 * dollia.armando@gmail.com
 *
 */

public class PolygonArea_4_5 {

	public static void main(String[] args) {
		Double sides, length, area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		sides = input.nextDouble();
		System.out.print("Enter the side: ");
		length= input.nextDouble();

		//calculation
		area = (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));
		
		System.out.println("The area of the polygon is " + area);
		
		input.close();
	}

}
