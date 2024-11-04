//Author:Swanit Rivankar
//RollNo:2452
//Title:Choose the correct Color
//Start Date:6th August 2024
//Modified Date:10th August 2024
//Description: This Java code implements a console-based game called "Choose the Correct Color." The game challenges the player to correctly identify either the color or the word displayed on the screen under various difficulty levels (Easy, Medium, Hard, and Custom).
import java.util.Random;
import java.util.Scanner;
public class Medium extends Level{
	public int medium(int score) throws InterruptedException {
		score=levelfunc(1500,score,10);
		return score;
	}

}
