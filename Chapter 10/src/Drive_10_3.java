import java.util.Scanner;


public class Drive_10_3 {

	public static void main(String[] args) {
		int number;
		char[] charNum = new char[5];
		String stringNum;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer");
		input.nextInt();
		MyInteger 
		System.out.println();

		System.out.println("Input a 5 digit number ");
		stringNum = input.next();
		for(int i = 0; i < 5; i++){
			charNum[i] = stringNum.charAt(i);
		}
		
		input.close();
	}

}
