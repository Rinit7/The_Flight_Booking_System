//Author:Swanit Rivankar
//RollNo:2452
//Title:Choose the correct Color
//Start Date:6th August 2024
//Modified Date:10th August 2024
//Description: This Java code implements a console-based game called "Choose the Correct Color." The game challenges the player to correctly identify either the color or the word displayed on the screen under various difficulty levels (Easy, Medium, Hard, and Custom).
import java.util.Random;
import java.util.Scanner;
public class Custom extends Level{
	int u,v;
	Scanner scanner = new Scanner(System.in);
	public int custom(int score) throws InterruptedException {
		System.out.println("Enter the cooldown time(in seconds):");
		int u=scanner.nextInt();
		u*=1000;
		System.out.println("Enter the number of rounds:");
		int v=scanner.nextInt();
		score=levelfunc(u,score,v);
		return score;
	}

}