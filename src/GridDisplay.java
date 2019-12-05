
/*
 Carlos Aybar
 Intro to Java
 12/04/19
 This game is to be played by two people, both players will have the opportunity to take 3 turns.
 at the end of those three turns, the player's scores will be compared and whoever has the highest avances to the 
 next round.
 In the second part, there will only be one player trying to fill in the 3by3 grid in order to win
 */

import javax.swing.JFrame;
import javax.swing.JButton; //imports JButton library
import java.awt.GridLayout; //imports GridLayout library


public class GridDisplay {
	GamePartII GameII = new GamePartII(); 
	JFrame frame = new JFrame(); //creates frame
	JButton[][] jGrid; //names the grid of buttons
	int [] [] grid;
	
	/**
	 * the GridDisplay method sets the frame, creates the grid and 
	 * calls to the method numbers() from the class GamePartII in
	 * order to pass the inputs into the grid
	 */
	public GridDisplay(){ // this is constructor to build the grid
		int width = 3;
		int length = 3;
		frame = new JFrame("DO or DIE"); //sets the header/name for the GUI
		frame.setLayout(new GridLayout(width,length)); //set layout
		grid = new int [3][3]; //initializing the size of the array that will be stored in the grid
		jGrid=new JButton[3][3]; //setting the size of grid
		for(int y=0; y<length; y++){
			for(int x = 0; x < width; x++){
				grid[x][y] = GamePartII.numbers();
				jGrid[x][y]=new JButton(""+grid[x][y]); // this creates new button every time the user inputs a number
				frame.add(jGrid[x][y]); //adds button to the grid 
				frame.setSize(1000, 1000); 
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack(); //sets appropriate size for frame
				frame.setVisible(true); //makes frame visible
				
			}
			
		}
	}
	
}

