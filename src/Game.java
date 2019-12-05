/*
 Carlos Aybar
 Intro to Java
 12/04/19
 This game is to be played by two people, both players will have the opportunity to take 3 turns.
 at the end of those three turns, the player's scores will be compared and whoever has the highest avances to the 
 next round.
 In the second part, there will only be one player trying to fill in the 3by3 grid in order to win
 */

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
public class Game {
	static int Player1Score = 0;
	static int Player2Score = 0;
	static int hint = 0;
	static int score = 0;
	
	/**
	 *the object main contains the new instances of the class Player.java
	 *this is also where the other methods are called in order to get the game
	 *to execute. 
	 */
	public static void main(String[] Args){
		//create all the variables in here
		Player  plr1 = new Player(); //creates an instance of the Player class called ply1
		plr1.setName(JOptionPane.showInputDialog("Player1 Name"));
		Player plr2 = new Player(); // creates an instance of the Player class called plyr2
		plr2.setName(JOptionPane.showInputDialog("Player2 Name"));
		random(plr1, plr2);
		winner(plr1 ,  plr2);

	}
	
	/**
	 * this method sets the turns for each player
	 * both of them will take three turns in the random game
	 * each turn will call the turns() method and return a score
	 * @param plr1 passing in the local variable plr1
	 * @param plr2 passing in the local variable pl2
	 */
	public static void random(Player plr1, Player plr2)
	{

		boolean inValid = false;
		do {
		try {
		//do {
			int playerTurn = Integer.parseInt(JOptionPane.showInputDialog("Press 1 or 2 to start playing"));
			if (playerTurn < 1 || playerTurn > 3) //checks to see if the user typed either 1 or 2
				{
				inValid = true; //if the user typed in anything other than 1 or 2, invalid will be true
				}
				
			else
				{
					for(int i = 0; i < 6; i++)
					{
						playerTurn = Integer.parseInt(JOptionPane.showInputDialog("Player1 enter 1 for your turn and Player2 enter 2:"));
						Random number = new Random();
						int hint = number.nextInt(11);

						if(playerTurn == 1)//when the player enters 1, it will be the 1st player's turn
						{
							Player1Score = turns(hint); 
							Player1Score++;
						}
						else if(playerTurn == 2) //when the player enter a two, it will be the second player's turn
						{
							Player2Score = turns(hint);
							Player2Score++;
						}
					}
					inValid = false;
				}
		}catch(NumberFormatException e) //checks to see if the user inputs anything other than an integer
				{
					JOptionPane.showMessageDialog(null , "invalid input!! click okay and start over");
					System.exit(0); //when the user enters a char, string, ir not input the game will close without crashing

				}
		}while(inValid);
		
	}
	
	
	
	
	

	/**
	 * 
	 * @param hint gets the hint/random number generated random() method
	 * it compares the number generated to one of the switches in this method
	 * once the random number is matched to one of the cases in the switch
	 * the score will be returned and added to the appropriate player
	 * @return returns the score
	 */

	public static int turns(int hint)
	{
		int value = hint;
		switch(value) {
		case 1 :
			JOptionPane.showMessageDialog(null, "You found a shortcut, advanced 25 steps");
			score += 25; //when the random number is 1, this will be added to the player score
			break;
		case 2 :
			
			JOptionPane.showMessageDialog(null, "Chased by a snake, went back 10 steps");
			score -= 10; //when the random number is 2, this will be added to the player score
			break;
		case 3 :
			JOptionPane.showMessageDialog(null, "Chased by a tiger, but managed to get 30 steps closer to the boat");
			score += 30; //when the random number is 3, this will be added to the player score
			break;
		case 4 :
			JOptionPane.showMessageDialog(null, "A horse took you 100 steps closer to the boat");
			score += 100; //when the random number is 4, this will be added to the player score
			break;
		case 5 :
			JOptionPane.showMessageDialog(null, "You are lost, rest until you find the way");
			score += 0; //when the random number is 5, this will be added to the player score
			break;
		case 6 :
			JOptionPane.showMessageDialog(null, "It is too dark, you are walking slower! advance 10 steps");
			score += 10;
			break;
		case 7 :
			JOptionPane.showMessageDialog(null, "It is nice and cool, you are know 70 steps closer");
			score += 70;
			break;
		case 8 :
			JOptionPane.showMessageDialog(null, "You advanced 15 steps, but now find shelter from the rain");
			score += 15;
			break;
		case 9 :
			JOptionPane.showMessageDialog(null, "You found a shortcut!!");
			score += 25;
			break;
		case 10 :
			JOptionPane.showMessageDialog(null, "You found the safest path in the iland and advanced 45 steps");
			score += 45;
			break;
		}
		return score;
	}
	
	/**
	 * this method compares player1score and player2score
	 * the player with the highest score wins and advances
	 * to the second part of the game
	 * @param plr1 passing in the local variable plr1
	 * @param plr2 passing in the local variable pl2
	 */
	public static void winner(Player plr1 , Player plr2)
	{
		if(Player1Score > Player2Score)
		{
			JOptionPane.showMessageDialog(null, "congratulations " + plr1.getName() + "!!! Unlock the boat to escape" +
					"\n" + "arrange nine numbers less than 10, " + 
			 		"\n" + "that on a 3 by 3 grid, always add up to 15"+
					"\n" + "diagonally, horizontally, and vertically");
			/*
			 * this try, creates the LeaderBoard.txt file and
			 * saves the name of the winer and the his/her score
			 */
			try {
			    FileWriter contacts = new FileWriter ("LeaderBoard.txt" , true);
				PrintWriter outputFile = new PrintWriter(contacts);
			    outputFile.print(plr1.getName());
			    outputFile.print(" ");
			    outputFile.print(Player1Score);
			    outputFile.print("\n");
			    outputFile.close();
			} catch(Exception e) {
			}

		}
		else
		{
			JOptionPane.showMessageDialog(null, "congratulations " + plr2.getName() + "!!! Unlock the boat to escape" +
					"\n" + "arrange nine numbers less than 10, " + 
			 		"\n" + "that on a 3 by 3 grid, always add up to 15"+
					"\n" + "diagonally, horizontally, and vertically");

			try {
			    FileWriter contacts = new FileWriter ("LeaderBoard.txt" , true);
				PrintWriter outputFile = new PrintWriter(contacts);
			    outputFile.print(plr2.getName());
			    outputFile.print(" ");
			    outputFile.print( Player2Score);
			    outputFile.print("\n");
			    outputFile.close();
			} catch(Exception e) {
			}

		} 
		GridDisplay gridDisplay = new GridDisplay(); //calls the gridDisplay method from the GridDisplay class
		GamePartII.checkIfWinner(gridDisplay.grid); //checks if the player wins after filling in the DO or DIE grid
	}


}