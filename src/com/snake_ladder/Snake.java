package com.snake_ladder;

public class Snake {

	public static void main(String[] args) {
		

		int position = 0;
		int position2 = 0;
		System.out.println(" Welcome player!! ");
		
		
		int dice;
		int option;
		int roll = 0;
		int turn = 0;
		int oldTurn = 0;
		
		
		while (position < 100 && position2 < 100) {
			
			if (turn == 0) 
				System.out.println(" Player 1 is playing");
			else
				System.out.println(" Player 2 is playing");
			
			dice = (int)Math.floor( (Math.random() * 10) % 6 + 1); 
			System.out.println(" The dice was rolled to: " + dice);
			option = (int)Math.floor(Math.random() * 3); 
			
			switch(option) {
			case 0: 
				System.out.println(" Player action: nothing");
				break;
			case 1: 
				System.out.println(" Player action: ladder");
				if (turn == 0) 
					position += dice;
					
				else
					position2 += dice;
				
				if (position > 100) {
					position -= dice;
					System.out.println(" Player1 exceeded 100 so not counting");
				}
				
				if (position2 > 100) {
					position2 -= dice;
					System.out.println(" Player2 exceeded 100 so not counting");
				}
				break;
			case 2: 
				System.out.println(" Player action: snake");
				if (turn != 0) 
					position -= dice;
					
				else
					position2 -= dice;
				
				
				if (position < 0) {
					position = 0;
					System.out.println(" Player1 reset to 0");
				}
				
				if (position2 < 0) {
					position2 = 0;
					System.out.println(" Player2 reset to 0");
				}
				
				turn = (turn + 1) % 2;
				break;
							
			}
			
			if (oldTurn == 0)
				System.out.println(" Current position for Player1: " + position + "\n");
			else
				System.out.println(" Current position for Player2: " + position2 + "\n");
			roll++;
			oldTurn = turn;
		}
		
		System.out.println(" Congratulations Player" + (turn + 1) + "!!");
		System.out.println(" We took " + roll + " rolls to win the game!!");
	}

}
