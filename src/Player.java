/*
 Carlos Aybar
 Intro to Java
 12/04/19
 This game is to be played by two people, both players will have the opportunity to take 3 turns.
 at the end of those three turns, the player's scores will be compared and whoever has the highest avances to the 
 next round.
 In the second part, there will only be one player trying to fill in the 3by3 grid in order to win
 */

public class Player {
	private String name;
	public int age;

	/**
	 * the setName method stores a value in the name field
	 * @param nam the value to store in name
	 */
	public void setName(String nam) 
	{
		name = nam;
	}
	
	
	/**
	 *  the getName method returns Player object's name
	 * @return the value in the name field will be returned
	 */

	public String getName()
	{
		return name;
	}


}