
public class MyInteger {
	
	private static int value;
	
	public MyInteger(){
		this(0);
	}
	
	public MyInteger(int value){
		MyInteger.value = value;
	}
	
	public int parseInt(String number){
		value =  Integer.parseInt(number);
		return value;
		
	}
	
	public boolean equals(int test){
		if(test == value){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int parseInt(char[] array){
		String numStr = "";
		for(int i = 0; i < array.length; i++){
			numStr += array[i];
		}
		value = Integer.parseInt(numStr);
		return value;
	}
	
	public static boolean isEven(MyInteger n){
		return MyInteger.isEven(value);
	}
	
	public static boolean isEven(int n){
		if( n % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isOdd(){
		if( value % 2 != 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isPrime(){
		int i = 2;
		boolean prime = false;
		while(prime == false && i <= (value/2)){
			if(value % i == 0){
				prime = true;
			}
			i++;
		}
		return prime;
	}
	
	public int getValue(){
		return value;
	}
}
