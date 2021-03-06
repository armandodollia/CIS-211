import java.util.Scanner;

/**
 * @author Armando Dollia
 * dollia.armando@gmail.com
 *
 */

public class NumberAverage_5_1 {

	public static void main(String[] args) {
		
		Integer positives = 0, negatives = 0;
		Double average, total = 0.0, number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		
		number = input.nextDouble();
		
		while(number != 0){
			total += number;
			
			if(number > 0.0){
				positives++;
			}
			else if(number < 0.0){
				negatives++;
			}
			
			number = input.nextDouble();
		}
		
		average = (double) (total / (negatives + positives));
		
		if(number == 0 && positives+negatives == 0){
			System.out.println("No numbers are entered except 0");
		}
		
		else{
			System.out.println("The number of positives is " + positives);
			System.out.println("The number of negatives is " + negatives);
			System.out.println("The total is " + total);
			System.out.println("The average is " + average);
		}
		
		input.close();
		
	}

}
