import java.awt.GridLayout;
import java.util.Random;
import java.util.Scanner;

public class GamePartII {

	
	/**
	 * @return 
	 * 
	 */
	public static void fifteen(int [] [] grid) //find a better name for this variable
	{
		boolean isNumber;
		Scanner input = new Scanner(System.in);
		int number = 0;
		for(int row = 0; row <3; row++)
		{
			for(int col = 0; col <3; col++)
			{
				grid[row][col] = numbers(); //writing the numbers in the grid
			}
		}


	}
	
	/**
	 * 
	 * @return
	 */
	public static int numbers()
	{
		Scanner input = new Scanner(System.in); 
		int number = 0;
		boolean isNumber;
		do {
			System.out.println("Plese enter a number from 1 to 9: ");
			if (input.hasNextInt()) 
			{
				number = input.nextInt();
				isNumber = true;
				}
				else
				{
					System.out.println("invalid input!! ");
					isNumber = false;
					input.next();

				}
			}while(isNumber == false);
			return number;
			}

	
	/**
	 * 
	 * @param grid
	 * @return
	 */
	public static boolean checkIfWinner(int[] [] grid) {
        if( grid [0][0] + grid[1][0] + grid[2][0] ==  15 &&
        	 grid [0][1] + grid[1][1] + grid[2][1] == 15 &&
        	 grid [0][2] + grid[1][2] + grid[2][2] == 15 &&
			 grid [0][0] + grid[0][1] + grid[0][2] == 15 &&
        	 grid [1][0] + grid[1][1] + grid[1][2] == 15 &&
		 	 grid [2][0] + grid[2][1] + grid[2][2] == 15 &&
		 	 grid [0][0] + grid[1][1] + grid[2][2] == 15 &&
        	 grid [2][0] + grid[1][1] + grid[0][2] == 15)
        {
        	System.out.println("Congratulations you can now navigate safely off the island");
            return true;
        }
        else
        {
        	System.out.println("Sorry you are stuck on the island forever and will soon starve");
            return false;
        }

}
	
	


}