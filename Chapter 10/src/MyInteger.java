
public class MyInteger {
	
	private int value;
	
	public MyInteger(){
		this(0);
	}
	
	public MyInteger(int value){
		this.value = value;
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
	
	public boolean equals(MyInteger n){
		return this.equals(n.getValue());
	}
	
	public int parseInt(char[] array){
		String numStr = "";
		for(int i = 0; i < array.length; i++){
			numStr += array[i];
		}
		value = Integer.parseInt(numStr);
		return value;
	}
	
	public boolean isEven(){
		return value % 2 == 0;
	}
	
	public static boolean isEven(MyInteger n){
		return n.isEven();
	}
	
	public boolean isOdd(){
		return ! this.isEven();
	}
	
	public static boolean isOdd(MyInteger n){
		return n.isOdd();
	}
	
	public boolean isPrime(){
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
	
	public static boolean isPrime(MyInteger n){
		return n.isPrime();
	}
	
	public int getValue(){
		return value;
	}
}
