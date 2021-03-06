import java.util.Scanner;


public class AssignGrades_7_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer students;
		
		System.out.print("Enter the number of students: ");
		students = input.nextInt();
		Double[] grades = new Double[students];
		
		System.out.print("Enter " + students + " scores: ");
		for(int i = 0; i < students; i++){
			grades[i] = input.nextDouble();
		}
		
		
		System.out.println(gradeConverter(grades, students));
		input.close();

	}
	
	public static String gradeConverter(Double[] grades, Integer students){
		String out = "";
		Double best = 0.0;
		
		for(int i = 0; i < students; i++){
			if(grades[i] >= best){
				best = grades[i];
			}
		}
		
		for(int i = 0; i < students; i++){
			if(grades[i] >= (best - 10)){
				out += "Student " + i + " score is " + grades[i] + " and grade is A" + "\n";
			}
			else if(grades[i] >= (best - 20)){
				out += "Student " + i + " score is " + grades[i] + " and grade is B" + "\n";
			}
			else if(grades[i] >= (best - 30)){
				out += "Student " + i + " score is " + grades[i] + " and grade is C" + "\n";
			}
			else if(grades[i] >= (best - 40)){
				out += "Student " + i + " score is " + grades[i] + " and grade is D" + "\n";
			}
			else{
				out += "Student " + i + " score is " + grades[i] + " and grade is F" + "\n";
			}
		}
		
		return out;
	}

}
