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

public class GamePartII {

	


	/**
	 * this method contains a two for loops that will call to the numbers() method
	 * to get the values to fill in the grid
	 * @param grid I pass in the array grid
	 */
	public static void fifteen(int [] [] grid) //find a better name for this variable
	{
		for(int row = 0; row <3; row++)
		{
			for(int col = 0; col <3; col++)
			{
				grid[row][col] = numbers(); //writing the numbers in the grid
			}
		}


	}
	
	/**
	 *  this method accepts numbers from 0-9 
	 * @return returns each number inputed by the player
	 */
	public static int numbers()
	{
		int number = 0;
		boolean isNumber = true; //sets the condition isNumber to true
		do {
			try {
			if (number > 0 || number < 10) 
			{
				number = Integer.parseInt(JOptionPane.showInputDialog("Plese enter a number from 1 to 9: "));
				isNumber = true; //if the user enters an integer, isNumber will be set to true
				}
				else
				{ 
					isNumber = false; //if the user enters a string or char, isNumber will be set to false

				}
			}catch(NumberFormatException e) //this also validates that the user inputs a number
				{
					JOptionPane.showMessageDialog(null , "invalid input!! click okay and start over"); //else it will display
																									   // this message and exit
					System.exit(0);

				}
			}while(!isNumber); //if the user inputs a anything other than a number, this will be executed
			return number;
			}

	
	/**
	 * this method checks if the diagonal, horizontal, and vertical sum
	 * of the values in the grid is equal to 15
	 * @param grid passes the variable grid into this method
	 * @return returns true if the player wins and false if he loses
	 */
	public static boolean checkIfWinner(int[] [] grid) {
        if( grid [0][0] + grid[1][0] + grid[2][0] ==  15 && //row 1
        	 grid [0][1] + grid[1][1] + grid[2][1] == 15 && //row 2
        	 grid [0][2] + grid[1][2] + grid[2][2] == 15 && //row 3
			 grid [0][0] + grid[0][1] + grid[0][2] == 15 && //column 1
        	 grid [1][0] + grid[1][1] + grid[1][2] == 15 && //column 2
		 	 grid [2][0] + grid[2][1] + grid[2][2] == 15 && //column 3
		 	 grid [0][0] + grid[1][1] + grid[2][2] == 15 && //diagonal 1
        	 grid [2][0] + grid[1][1] + grid[0][2] == 15)   //diagonal 2
        {
        	JOptionPane.showMessageDialog(null, "Congratulations you can now navigate safely off the island");
            return true;
        }
        else
        {
        	JOptionPane.showMessageDialog(null, "Sorry you are stuck on the island forever and will soon starve");
            return false;
        }

}
	
	


}