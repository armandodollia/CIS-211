
public class FeetMeterConverter_6_9 {

	public static void main(String[] args) {
		
		final String METER = "Meters", FEET = "Feet", PIPE = "|";
		Double j = 20.0;
		
		System.out.printf("%-9s%9s%1s%-3s%-7s%7s\n", FEET, METER, "", PIPE, METER, FEET);
		
		for(double i = 1; i < 11; i++){
			System.out.printf("%-8.1f%9.3f%2s%-3s%-8.1f%9.3f\n", i, footToMeter(i), "", PIPE, j, meterToFoot(j));
			j += 5.0;
		}

	}
	
	public static double footToMeter(double foot){
		return (.3048 * foot);
	}

	public static double meterToFoot(double meter){
		return (3.2808399 * meter);
	}
}
