package com.ineuron.guesser_game.assignment3;

import java.util.Scanner;

class Guesser{
	
	int guessNumber;
	int guessNum(){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Guesser Kindly guess the number");
		guessNumber=sc.nextInt();
		return guessNumber;
		
	}
	
}

class Umpire{
	int collectNumFromGuesser;
	int collectNumFromPlayer1;
	int collectNumFromPlayer2;
	int collectNumFromPlayer3;
	
	void collectNumFromGuesser(){
		
		Guesser g = new Guesser();
		collectNumFromGuesser=g.guessNum();
		
	}
	void collectNumFromPlayer(){
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		collectNumFromPlayer1=p1.guessNum();
		collectNumFromPlayer2=p2.guessNum();
		collectNumFromPlayer3=p3.guessNum() ;
		
	}
	void compare(){
		if(collectNumFromGuesser==collectNumFromPlayer1) {
			if(collectNumFromGuesser==collectNumFromPlayer2 && collectNumFromGuesser==collectNumFromPlayer3) {
				System.out.println("Game Tie");
				System.out.println("2 points is allocated equally to every team");
			}else if(collectNumFromGuesser==collectNumFromPlayer2) {
				System.out.println("Player 1 and Player 2 won the game");
				System.out.println("Player 1 and Player 2 reached in final with each having 3 points");
				
			}else if(collectNumFromGuesser==collectNumFromPlayer3) {
				System.out.println("Player 1 and Player 3 won the game");
			}else {
			System.out.println("Player 1 won the game");
			System.out.println("Player 1 is the winner with 6 points");
		}}else if(collectNumFromGuesser==collectNumFromPlayer2) {
			if(collectNumFromGuesser==collectNumFromPlayer3) {
				System.out.println("Player 2 and Player 3 won the game ");
				
			}else {
			System.out.println("Player 2 won the game");
			System.out.println("Player 2 is the winner with 6 points");
		}}else if(collectNumFromGuesser==collectNumFromPlayer3) {
			System.out.println("Player 3 won the game");
			System.out.println("Player 3 is the winner with 6 points");
		}else {
			System.out.println("All lost try again");
		}
		}
	}

class Player{
	
	int guessNumber;
	int guessNum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Player Kindly guess the number");
		guessNumber=sc.nextInt();
		return guessNumber;
	}
		
}

public class GuesserGame {

	
	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}
}
