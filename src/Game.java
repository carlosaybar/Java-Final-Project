/*
 Carlos Aybar
 Intro to Java
 10/04/19
 This game is to be played by two people, each one creates a hero and chooses four characteristic, which all have values.
 All the values for each hero is outputed and multiplied by a ramndom number to determine who wins each round.
 */

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
public class Game {
	//GridDisplay gridDisplay = new GridDisplay();
	static int Player1Score = 0;
	static int Player2Score = 0;
	static int hint = 0;
	static int score = 0;
	
	/**
	 * 
	 * @param Args
	 */
	public static void main(String[] Args){
		//create all the variables in here
		Scanner input = new Scanner(System.in);
		Player  plr1 = new Player(); //creates an instance of the Player class called ply1
		//JOptionPane.showInputDialog("Please enter your name: ");
		plr1.setName(JOptionPane.showInputDialog("Player1 Name"));
		//plr1.setName(input.nextLine()); //sets the name for the first player
		Player plr2 = new Player(); // creates an instance of the Player class called plyr2
		plr2.setName(JOptionPane.showInputDialog("Player2 Name"));
		//JOptionPane.showInputDialog("Please enter your name: ");
		//plr2.setName(input.nextLine()); //sets the name for the second player
		random(Player1Score, Player2Score, plr1, plr2 , score);
		winner(Player1Score , Player2Score , plr1 ,  plr2);

	}
	
	/**
	 * 
	 * @param Player1Score
	 * @param Player2Score
	 * @param plr1
	 * @param plr2
	 * @param score
	 */
	public static void random(int Player1Score, int Player2Score, Player plr1, Player plr2 , int score)
	{
		Scanner input = new Scanner(System.in); 
		boolean isValid;
		do {
			int playerTurn;
			playerTurn = Integer.parseInt(JOptionPane.showInputDialog("Player1 enter 1 for your turn and Player2 enter 2:"));
			//JOptionPane.showInputDialog("Plese enter either 1 or 2: ");
			if (playerTurn ==1 || playerTurn == 2) 
				{
				for(int i = 1; i < 6; i++)
				{
					playerTurn = Integer.parseInt(JOptionPane.showInputDialog("Player1 enter 1 for your turn and Player2 enter 2:"));
					//JOptionPane.showInputDialog("Player1 enter 1 for your turn and Player2 enter 2");
					//int playerTurn = input.nextInt();
					Random number = new Random();
					int hint = number.nextInt(11); 

					if(playerTurn == 1)
					{
						Player1Score = turns(hint , score);
						Player1Score++;
					}
					else
					{
						Player2Score = turns(hint , score);
						Player2Score++;
					}
				}
				isValid = true;
				}
				else
				{
					JOptionPane.showInputDialog("invalid input!! ");
					isValid = false;
					input.next();

				}
			}while(isValid == false);
	}
	
	
	
	
	

	/**
	 * 
	 * @param hint
	 * @return
	 */

	public static int turns(int hint , int score)
	{
		//int score = 0; 
		int value = hint;
		switch(value) {
		case 1 :
			JOptionPane.showMessageDialog(null, "You found a shortcut, advanced 25 steps");
			score += 25;
			break;
		case 2 :
			
			JOptionPane.showMessageDialog(null, "Chased by a snake, went back 10 steps");
			score -= 10;
			break;
		case 3 :
			JOptionPane.showMessageDialog(null, "Chased by a tiger, but managed to get 30 steps closer to the boat");
			score += 30;
			break;
		case 4 :
			JOptionPane.showMessageDialog(null, "A horse took you 100 steps closer to the boat");
			score += 100;
			break;
		case 5 :
			JOptionPane.showMessageDialog(null, "You are lost, rest until you find the way");
			score += 0;
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
	 * 
	 * @param Player1Score
	 * @param Player2Score
	 * @param plr1
	 * @param plr2
	 */
	public static void winner(int Player1Score , int Player2Score , Player plr1 , Player plr2)
	{
		if(Player1Score > Player2Score)
		{
			JOptionPane.showMessageDialog(null, "congratulations " + plr1.getName() + "!!! Unlock the boat to escape" +
					"\n" + "arrange nine numbers less than 10, " + 
			 		"\n" + "that on a 3 by 3 grid, always add up to 15"+
					"\n" + "diagonally, horizontally, and vertically");
			try {
			    FileWriter contacts = new FileWriter ("Contacts.txt" , true);
				PrintWriter outputFile = new PrintWriter(contacts);
			    outputFile.print(plr1.getName());
			    outputFile.print(Player1Score);
			    outputFile.print("\n");
			    outputFile.close();
			} catch(Exception e) {
			   // e.printStackTrace();
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
			    outputFile.print( Player2Score);
			    outputFile.print("\n");
			    outputFile.close();
			} catch(Exception e) {
			   // e.printStackTrace();
			}

		}
		GridDisplay gridDisplay = new GridDisplay();
		GamePartII.checkIfWinner(gridDisplay.grid);
	}


}