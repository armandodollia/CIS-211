import java.util.Scanner;

/**
 * @author Armando Dollia
 * dollia.armando@gmail.com
 *
 */

public class Pentagon_4_1 {

	public static void main(String[] args) {
		Double r, s, area;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex: ");
		r = input.nextDouble();
		
		//calculations	
		s = 2 * r * Math.sin(Math.PI / 5.0);
		area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5.0));

		System.out.printf("The area of the pentagon is %.2f", area);
		
		input.close();
	}

}
