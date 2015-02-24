import java.util.Scanner;

/**
 * @author Armando Dollia
 * dollia.armando@gmail.com
 *
 */

public class UnicodeFinder_4_9 {

	public static void main(String[] args) {
		char letter;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		letter = input.next().charAt(0);
		//print character value
		System.out.print("The Unicode for character " + letter + " is: " + (int)letter);
		input.close();
	}

}
