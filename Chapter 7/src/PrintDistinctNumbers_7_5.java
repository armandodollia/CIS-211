import java.util.Scanner;


public class PrintDistinctNumbers_7_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean exists;
		Integer n=1, numbers;
		String output = "The distinct numbers are:";
		
		System.out.print("How many numbers: ");
		numbers = input.nextInt();
		Integer[] noFilter = new Integer[numbers];
		
		System.out.print("Enter the numbers: ");
		for(int i = 0; i < numbers; i++){
			noFilter[i] = input.nextInt();
		}
		
		Integer[] filter = new Integer[numbers - duplicateCount(noFilter)];
		
		filter[0] = noFilter[0];
		for(int i = 1; i < numbers; i++){
			exists = false;
			for(int j = 0; j < n; j++){
				if(filter[j] == noFilter[i]){
					exists = true;
				}
				
			}
			if(exists != true){
				filter[n] = noFilter[i];
				n++;
			}
			
		}
		
		for(int i = 0; i < filter.length; i++){
			output += " " + filter[i];
		}
		
		System.out.print("The number of distinct numbers is: " + filter.length + "\n" + output);
		input.close();
		
	}
	
	public static Integer duplicateCount(Integer[] noFilter){
		Integer duplicates = 0;
		
		for(int i = 0; i < 10; i++){
			boolean exists = false;
			for(int j = noFilter.length-1; j > i; j--){		
				if(noFilter[i] == noFilter[j]){
					exists = true;
					}
				}
				if(exists){
				duplicates++;
				}
			}
		return duplicates;
	}

}
