import java.util.Scanner;
/**
 * @author Armando Dollia
 * dollia.armando@gmail.com
 *
 */

public class HighestScores_5_9 {

	public static void main(String[] args) {
		Integer students = 0;
		String name1 = "", name2 = "", nameSwap = "";
		Double score1 = 0.0, score2 = 0.0, scoreSwap = 0.0;	
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Number of students: ");
		students = input.nextInt();
		
		for(int i = 1; i <= students; i++){
			System.out.println("Please enter the name and score of student " + i + ":");
			nameSwap = input.next();
			scoreSwap = input.nextDouble();
			
			if(scoreSwap >= score1 && scoreSwap > score2){
				name2 = name1;
				score2 = score1;
				name1 = nameSwap;
				score1 = scoreSwap;
			}
			else if(scoreSwap <= score1 && scoreSwap >= score2){
				name2 = nameSwap;
				score2 = scoreSwap;
			}

		}
		
		if(students == 1){
			System.out.println(name1 + ", the only student that took the test, had a score of " + score1);
		}
		else{
		System.out.println(name1 + " was first with a score of " + score1 + " and " + name2 + " was second with a score of " + score2);
		}
		
		
		input.close();

	}

}
