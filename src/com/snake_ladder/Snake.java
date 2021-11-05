package com.snake_ladder;

public class Snake {

	public static void main(String[] args) {
		
		int player_position = 0;
		int dice_roll_time = 0;
		
		System.out.println("Lets start the game");
		
		System.out.println("The current position of player is "+ player_position);
	
		while(player_position <100) {
		int dice = (int)Math.floor((Math.random()*10)%6+1); 
		System.out.println("The dice number is "+dice);
		
		int option = (int)Math.floor((Math.random()*10)%3);
		
		switch(option) {
		
		case 0:
			System.out.println("No Play, Roll again");
			break;
			
		case 1:
			System.out.println("Bravo! You found a ladder");
			player_position = player_position + dice;
			break;
		
		case 2:
			System.out.println("Snake!Go backsteps, shown on dice");
			player_position = player_position - dice;
			if(player_position < 0) {
				player_position = 0;
			}
			break;
		}
		
		if(player_position > 100) {
			player_position = 100;
		}
		System.out.println("The current position of player is "+ player_position);
		dice_roll_time++;
		
		}
		System.out.println("You have completed the game in "+dice_roll_time+" dice rolls");
	}
		
		

}
