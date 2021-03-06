import java.util.Scanner;

/**
 * @author Armando Dollia
 * dollia.armando@gmail.com
 *
 */

public class ISBNchecker_3_9 {
	
	public static void main(String[] args) {
		Integer checksum = 0, lastDigit, counter = 1;
		String firstDigits, firstNine = "";
		int[] array = new int[9];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		firstDigits = input.next();
		
		for(int i = 0; i < 9; i++){
		array[i] = Character.getNumericValue((firstDigits.charAt(i)));
		}
		
		for(int i = 0; i < 9; i++){
			checksum += (array[i] * counter);
			counter++;
		}
		
		lastDigit = checksum % 11;
		
		for(int i = 0; i < 9; i++){
			firstNine += (array[i]);
			counter++;
		}
		
		if(lastDigit == 10){
			System.out.println("The ISBN-10 number is " + firstNine + "X");
		}
		else{
			System.out.println("The ISBN-10 number is " + firstNine + lastDigit);
		}
		
		input.close();
	}
	
}
