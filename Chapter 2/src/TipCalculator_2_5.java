import java.util.Scanner;

/**
 * @author Armando Dollia
 * dollia.armando@gmail.com
 *
 */

public class TipCalculator_2_5 {

	public static void main(String[] args) {
		Double sub, tip;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the sub-total?");
		sub = input.nextDouble();
		System.out.println("What percentage do you want to tip?");
		tip = input.nextDouble() * sub / 100;
		System.out.println("Gratuity = $" + tip + " Total = $" + (sub + tip));

		input.close();
	}

}
