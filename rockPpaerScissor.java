import java.util.Scanner;

public class rockPpaerScissor {
	
	final static int ROCK=1,SCISSOR=2,PAPER=3;

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("player 1: choose (1)-rock,(2)-Scissor,(3)-paper");
		
		int player1=sc.nextInt();
		
		System.out.println("player 2: choose(1)-rock,(2)-scissor,(3)-paper ");
		
		int player2=sc.nextInt();
		
		if(player1 == player2) {
			System.out.println("it is TIE!!!!!");
			
		}else {
			switch(player1) {
			case ROCK:
				if(player2 == SCISSOR) 
					System.out.println("player 1 win");
				else 
					System.out.println("player 2 win");
				    break;
					
					
					case SCISSOR:
						if(player2==PAPER)
							System.out.println("palyer 1 win");
						else
							System.out.println("palyer 2 winn");
						break;
					case PAPER:
						if(player2== ROCK)
							System.out.println("player 1 wins");
						else
							System.out.println("palyer 2 wins");
						break;
							
				}
			}
		}
		
		

	}


