import java.util.Scanner;


public class TicTacToe_8_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] ttt = new char[3][3];
		Integer x, y;
		String winner = "The winner is ";
		Boolean tie = false;
		int i = 0;
		
		while(winCheckerX(ttt) != true && winCheckerO(ttt) != true && tie != true){

			System.out.println("Enter a row (0, 1, or 2) for player X: ");
			y = input.nextInt();
			System.out.println("Enter a column (0, 1, or 2) for player X: ");
			x = input.nextInt();
			i++;
			ttt[y][x] = 'X';
			System.out.println(tttPrint(ttt));
			
			if(winCheckerX(ttt)){	
				winner += "X!";
			}
				
			else if(winCheckerX(ttt) != true && i < 9){
				System.out.println("Enter a row (0, 1, or 2) for player O: ");
				y = input.nextInt();
				System.out.println("Enter a column (0, 1, or 2) for player O: ");
				x = input.nextInt();
				i++;
				ttt[y][x] = 'O';
				System.out.println(tttPrint(ttt));
				
				if(winCheckerO(ttt)){
					winner += "O!";
				}
			}
			
			else if (winCheckerX(ttt) != true && winCheckerO(ttt) != true && i == 9){
				tie = true;
				winner += "Nobody!";
			}
		}
		System.out.println(winner);
		input.close();
	}
	
	public static String tttPrint(char[][] ttt){
		String display = "";
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(i == 0 && j == 0){
					display += "-------------" + "\n" + "| " + ttt[i][j] + " ";
				}
				else if (j < 2){
					display += "| " + ttt[i][j] + " ";
				}
				else if(j == 2){
					display += "| " + ttt[i][j] + " |" + "\n" + "-------------" + "\n";
				}

				
			}	
		}
		return display;
	}

	public static Boolean winCheckerX(char[][] ttt){

		if(ttt == null){
			return false;
		}
		else if (ttt[0][0] == 'X' && ttt[0][1] == 'X' && ttt[0][2] == 'X'){
			return true;
		}
		
		else if (ttt[1][0] == 'X' && ttt[1][1] == 'X' && ttt[1][2] == 'X'){
			return true;
		}
		
		else if (ttt[2][0] == 'X' && ttt[2][1] == 'X' && ttt[2][2] == 'X'){
			return true;
		}
		
		else if (ttt[0][0] == 'X' && ttt[1][0] == 'X' && ttt[2][0] == 'X'){
			return true;
		}
		
		else if (ttt[0][1] == 'X' && ttt[1][1] == 'X' && ttt[2][1] == 'X'){
			return true;
		}
		
		else if (ttt[0][2] == 'X' && ttt[1][2] == 'X' && ttt[2][2] == 'X'){
			return true;
		}
		
		else if (ttt[0][0] == 'X' && ttt[1][1] == 'X' && ttt[2][2] == 'X'){
			return true;
		}
		
		else if (ttt[0][2] == 'X' && ttt[1][1] == 'X' && ttt[2][0] == 'X'){
			return true;
		}

		else{
			return false;
		}

	}
	
	public static Boolean winCheckerO(char[][] ttt){
		
		if(ttt[0] == null){
			return false;
		}
		else if (ttt[0][0] == 'O' && ttt[0][1] == 'O' && ttt[0][2] == 'O'){
			return true;
		}
		
		else if (ttt[1][0] == 'O' && ttt[1][1] == 'O' && ttt[1][2] == 'O'){
			return true;
		}
		
		else if (ttt[2][0] == 'O' && ttt[2][1] == 'O' && ttt[2][2] == 'O'){
			return true;
		}
		
		else if (ttt[0][0] == 'O' && ttt[1][0] == 'O' && ttt[2][0] == 'O'){
			return true;
		}
		
		else if (ttt[0][1] == 'O' && ttt[1][1] == 'O' && ttt[2][1] == 'O'){
			return true;
		}
		
		else if (ttt[0][2] == 'O' && ttt[1][2] == 'O' && ttt[2][2] == 'O'){
			return true;
		}
		
		else if (ttt[0][0] == 'O' && ttt[1][1] == 'O' && ttt[2][2] == 'O'){
			return true;
		}
		
		else if (ttt[0][2] == 'O' && ttt[1][1] == 'O' && ttt[2][0] == 'O'){
			return true;
		}
		else{
			return false;
		}
	}
}
