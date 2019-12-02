import javax.swing.JFrame;
import javax.swing.JButton; //imports JButton library
import java.awt.GridLayout; //imports GridLayout library

/**
 * 
 * @author Missions
 *
 */
public class GridDisplay {
	GamePartII GameII = new GamePartII(); 
	JFrame frame = new JFrame(); //creates frame
	JButton[][] jGrid; //names the grid of buttons
	int [] [] grid;
	
	/**
	 * 
	 */
	public GridDisplay(){ //constructor
		int width = 3;
		int length = 3;
		frame.setLayout(new GridLayout(width,length)); //set layout
		grid = new int [3][3];
		jGrid=new JButton[3][3]; //allocate the size of grid
		for(int y=0; y<length; y++){
			for(int x = 0; x < width; x++){
				grid[x][y] = GamePartII.numbers();
				jGrid[x][y]=new JButton(""+grid[x][y]); //creates new button	  
				frame.add(jGrid[x][y]); //adds button to grid 
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack(); //sets appropriate size for frame
				frame.setVisible(true); //makes frame visible
				
			}
			
		}
	}
	
}

