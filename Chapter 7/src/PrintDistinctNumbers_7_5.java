import java.util.Scanner;


public class PrintDistinctNumbers_7_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer[] noFilter = new Integer[10];
		boolean exists;
		Integer n=1;
		String output = "The distinct numbers are:";
		
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < 10; i++){
			noFilter[i] = input.nextInt();
		}
		
		Integer[] filter = new Integer[10 - duplicateCount(noFilter)];
		
		filter[0] = noFilter[0];
		for(int i = 1; i < 10; i++){
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
		boolean exists = false;
		for(int i = 0; i < 10; i++){
			while(exists){
			for(int j = 9; j > 0; j--){
				if(noFilter[i] == noFilter[j]){
					exists = true;
					}
				}
			duplicates++;
			}
		}
		return duplicates;
	}

}
