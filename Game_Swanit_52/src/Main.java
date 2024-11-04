//Author:Swanit Rivankar
//RollNo:2452
//Title:Choose the correct Color
//Start Date:6th August 2024
//Modified Date:10th August 2024
//Description: This Java code implements a console-based game called "Choose the Correct Color." The game challenges the player to correctly identify either the color or the word displayed on the screen under various difficulty levels (Easy, Medium, Hard, and Custom).
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        while (true) {
            System.out.println("===============================================");
            System.out.println("           Choose the correct Color");
            System.out.println("===============================================");
            System.out.println("Choose Difficulty:");
            System.out.println("1.Easy");
            System.out.println("2.Medium");
            System.out.println("3.Hard");
            System.out.println("4.Custom");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Easy e1 = new Easy();
                    score = e1.easy(score);
                    System.out.println("Your score is: " + score);
                    score=0;
                    break;
                case 2:
                    Medium m1 = new Medium();
                    score = m1.medium(score);
                    System.out.println("Your score is: " + score);
                    score=0;
                    break;
                case 3:
                    Hard h1 = new Hard();
                    score = h1.hard(score);
                    System.out.println("Your score is: " + score);
                    score=0;
                    break;
                case 4:
                	Custom c1 = new Custom();
                    score = c1.custom(score);
                    System.out.println("Your score is: " + score);
                    score=0;
                    break;
                case 5:
                    System.out.println("Thank you for playing!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

            System.out.println();
        }
    }
}
