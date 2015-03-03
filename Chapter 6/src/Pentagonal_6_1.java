
public class Pentagonal_6_1 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++){
			
			if(i % 10 == 0){
				System.out.println(getPentagonalNumber(i) + " ");
			}
			
			else if(i % 10 != 0){
				System.out.print(getPentagonalNumber(i) + " ");
			}
		}
	}
	
	public static int getPentagonalNumber(int n){
		int penta = (n * (3 * n - 1)) / 2;
		return penta;
	}

}
