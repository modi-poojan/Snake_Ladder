package com.snake_ladder;

public class Snake {

	public static void main(String[] args) {
		
		int player_position = 0;
		
		System.out.println("Lets start the game");
		
		System.out.println("The current position of player is "+ player_position);
		
		double dice = Math.floor((Math.random()*10)%6+1); 
		System.out.println("The dice number is "+dice);

	}

}
