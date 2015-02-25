/**
 * @author Armando Dollia
 * dollia.armando@gmail.com
 *
 */

public class PoundKilogramConverter_5_5 {

	public static void main(String[] args) {
		
		final String KILO = "Kilograms", POUND = "Pounds", PIPE = "|";
		Integer j = 20;
		
		System.out.printf("%-8s%8s%2s%-3s%-8s%8s\n", KILO, POUND, "", PIPE, POUND, KILO);
		
		for(int i = 1; i < 200; i+=2){
			System.out.printf("%-8d%9.1f%2s%-3s%-8d%9.2f\n", i, (i * 2.2), "", PIPE, j, (j / 2.2));
			j += 5;
		}

	}

}
