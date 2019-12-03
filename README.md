<font color="red">DO or DIE!!!</font>

Two people are stuck on an island, there is a boat that can carry one of them off the island. The people will test their luck in the first part of the game, by participating in the random game. Each random number has a specific score that will be added to each player after each turn. At the end of the random game, there will be a score for the first player and a score for the other player. The person with the highest score makes it to where the boat is, however, in order to unlock the boat that player must come up with 9 numbers from 0-9 using each number only once. The player must arrange these nine numbers on a 3X3 grid in a way that the sum of the rows, columns, and diagonals always add up to 15. If the player is able to come up with this combination, thus unlocking the boat, he will be able to flee the island and the other player will be stuck on the island forever. If the player is unable to unlock the boat, he will starve on the island along with the other player.

### Motivation

There are many games that either test your luck or your strategies. However, there are few that test both. This is why I decided to come up with this game that would test a player’s luck as well as his critical thinking skills and strategies. 
Tech/framework used

### This game was built using

* Eclipse

### Features

The features that make my game stand out are:
* Its levels of difficulty, first the game starts really easy and gets harder as it progresses
* It enhances your brain to think fast and accurately, by giving its players once chance to come up with the right solution to a difficult problem. 
* Gives the players time to think and plan his next move by allowing them to see their updated grid every time they input a new number.

### Code Example

Below I have included the three most important chunks of code for my game:

**These are the steps taken to pass the nine numbers into the two dimensional array grid**

![Screenshot1](https://user-images.githubusercontent.com/58013489/70016762-39877600-154f-11ea-97fe-8ba95425536a.png)

**These chunk of code below checks to see if the player won**

![Screenshot2](https://user-images.githubusercontent.com/58013489/70016763-39877600-154f-11ea-9602-fa9c5bbf1181.png)

**How the grid will be populated and displayed**

![Screenshot3](https://user-images.githubusercontent.com/58013489/70016765-39877600-154f-11ea-95d3-c7f4a732b903.png)

### Installation

The libraries imported in order to create this game were:
* javax.swing.JFrame: sets the size of the frame for the grid
* javax.swing.JButton: to create a grid and accept values
* java.awt.GridLayout: to display the grid in the second part of the game
* import javax.swing.JOptionPane: display/accept inputs in the user dialog box
* import java.util.Scanner: to accept inputs from the players
* import java.io.FileWriter: to create the leaderboard.txt file
* import java.io.PrintWriter: to save the scores into the leaderboard.txt file
* import java.util.Random: to generate random numbers

### How to use?

To play this game, first, go into the Game.java file and press run or debug on the platform that you are using. Remember that there is a two player game, so you can play with a friend or by yourself as long as you provide a name for Player1 and a name for Player2. 

1. Once you have clicked the run button, the input dialog box will be displayed asking for the 1st player’s name, type the first name and click OKAY or tap enter. 

![Screenshot4](https://user-images.githubusercontent.com/58013489/70016766-3a200c80-154f-11ea-8516-23976c2634e3.png)
 
2. The 2nd player will be asked to provide his name as well. When both names are set, the input dialog box will be displayed again asking the user to type 1 when it is the first player’s turn or 2 when it is the second player’s turn. 

![Screenshot5](https://user-images.githubusercontent.com/58013489/70016767-3a200c80-154f-11ea-9926-f6748c15dfc1.png)

3. Both players will have the opportunity to take 3 turns. 

![Screenshot6](https://user-images.githubusercontent.com/58013489/70016769-3a200c80-154f-11ea-998e-8afd1de338be.png)

4. When each player has taken his/her’s 3 turns, the scores will be compared and the player with the highest score will advance to the second part of the game.

![Screenshot7](https://user-images.githubusercontent.com/58013489/70016770-3a200c80-154f-11ea-8d02-2e995802ba1e.png)

5. Here the player will be required to arrange nine numbers from 1-9 on the 3 by three grid in a way that they always add up to 15 diagonally, horizontally, and vertically. The player will have the opportunity to see exactly the numbers he/she is inputting into each square of the grid.

![Screenshot8](https://user-images.githubusercontent.com/58013489/70018536-799d2780-1554-11ea-985b-2dc066d4701c.png)
 			
6. After the grid is filled, the game will check to see if the user was able to arrange the numbers correctly. If the player completed the grid correctly, he/she will be able to escape the island, he/she will be stuck forever.

![Screenshot9](https://user-images.githubusercontent.com/58013489/70016772-3a200c80-154f-11ea-9cdf-e8d0d9fa5213.png)
		
 
### Credits

* https://gluonhq.com/products/javafx/
* https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html
* Classroom textbook and previous codes

### License

STU © Carlos Aybar De Los Santos


