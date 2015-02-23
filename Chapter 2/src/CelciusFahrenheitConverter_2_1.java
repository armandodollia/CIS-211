import java.util.Scanner;

/**
 * @author Armando Dollia
 * dollia.armando@gmail.com
 *
 */

public class CelciusFahrenheitConverter_2_1 {

	public static void main(String[] args) {
		double c, f;
		Scanner input = new Scanner(System.in);
		System.out.println("Input a temperature in celcius");
		c = input.nextDouble();
		f = (9.0/5.0) * c + 32;
		
		System.out.println(c + " Degrees celcius = " + f + " degrees fahrenheit");
		
		input.close();

	}

}
