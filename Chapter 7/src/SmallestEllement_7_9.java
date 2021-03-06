import java.util.Scanner;


public class SmallestEllement_7_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer numbers;
		
		System.out.print("How many numbers: ");
		numbers = input.nextInt();
		Double[] array = new Double[numbers];
		
		System.out.print("Input the numbers: ");
		for(int i = 0; i < numbers; i++){
			array[i] = input.nextDouble();
		}
		
		System.out.printf("The minimum number is: %.1f", min(array));
		
		input.close();
	}

	public static double min(Double[] array){
		Double minimum = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] < minimum){
				minimum = array[i];
			}
		}
		return minimum;
	}
}
