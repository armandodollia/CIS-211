import java.util.Scanner;


public class ColumnSum_8_1 {

	public static void main(String[] args) {
		double[][] m = new double[3][4];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 3-by-4 matrix row by row:");
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				m[i][j] = input.nextDouble();
			}
		}
		
		for(int i = 0; i < 4; i++){
			System.out.println("Sum of elements at column 0 is " + sumColumn(m, i));
		}
		
		input.close();
	}
	
	public static double sumColumn(double[][] m, int columnIndex){
		double sum = 0;
		for(int i = 0; i < 3; i++){
			sum += m[i][columnIndex];
		}
		return sum;
	}

}
