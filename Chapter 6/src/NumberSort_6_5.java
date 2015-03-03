import java.util.Scanner;


public class NumberSort_6_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double one, two, three;
		
		System.out.println("Please input 3 numbers to sort:");
		one = input.nextDouble();
		two = input.nextDouble();
		three = input.nextDouble();
		displaySortedNumbers(one, two, three);

		input.close();
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3){
		
		boolean swapped = true;
		double buffer;
		
		while (swapped){
			if (num1 > num2 && num1 != num2){
				buffer = num1;
				num1 = num2;
				num2 = buffer;
				swapped = true;
			}
			
			else if (num2 > num3 && num2 != num3){
				buffer = num2;
				num2 = num3;
				num3 = buffer;
				swapped = true;
			}
			else{
				swapped = false;
			}
		}
		System.out.println(num1 + " " + num2 + " " + num3);
		
	}

}
