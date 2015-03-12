import java.util.Scanner;


public class MatrixAdd_8_5 {

	public static void main(String[] args) {
		double a[][] = new double[3][3];
		double b[][] = new double[3][3];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter matrix 1: ");
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				a[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("Enter matrix 2: ");
		
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[0].length; j++){
				b[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("The matrices are added as follows");
		System.out.print(matrixToText(a, b));
		
		input.close();

	}
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = new double[a.length][a[0].length];
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[0].length; j++){
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	
	public static String matrixToText(double[][] a, double[][] b){
		String out = "";
		for(int i = 0; i < a.length; i++){
			if(i== 1){
				out += a[i][0] + " " + a[i][1] + " " + a[i][2] + "  +  " + b[i][0] + " " + b[i][1] + " " + b[i][2] + "  =  "
						+ addMatrix(a, b)[i][0] + " " + addMatrix(a, b)[i][1] + " " + addMatrix(a, b)[i][2] + "\n";
			}
			else{
				out += a[i][0] + " " + a[i][1] + " " + a[i][2] + "     " + b[i][0] + " " + b[i][1] + " " + b[i][2] + "     "
						+ addMatrix(a, b)[i][0] + " " + addMatrix(a, b)[i][1] + " " + addMatrix(a, b)[i][2] + "\n";
			}
		}
		return out;
	}

}
