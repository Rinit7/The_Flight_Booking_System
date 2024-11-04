//Author:Swanit Rivankar
//RollNo:2452
//Title:Choose the correct Color
//Start Date:6th August 2024
//Modified Date:10th August 2024
//Description: This Java code implements a console-based game called "Choose the Correct Color." The game challenges the player to correctly identify either the color or the word displayed on the screen under various difficulty levels (Easy, Medium, Hard, and Custom).
import java.util.Random;
import java.util.Scanner;

public class Level {
    public static final String Red = "\033[0;31m";
    public static final String Green = "\033[0;32m";
    public static final String Yellow = "\033[0;33m";
    public static final String Blue = "\033[0;34m";
    public static final String Purple = "\033[0;35m";
    public static final String Reset = "\033[0m";

    private static final String[] COLORS = {Red, Green, Yellow, Blue, Purple};
    private static final String[] WORDS = {"red", "green", "yellow", "blue", "purple"};

    private String a;
    private int b, r;

    public int levelfunc(int t, int score, int p) throws InterruptedException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nGame starts in....");
        Thread.sleep(1000);
        System.out.println("3..");
        Thread.sleep(1000);
        System.out.println("2..");
        Thread.sleep(1000);
        System.out.println("1..\n");
        Thread.sleep(1000);

        for (int j = 0; j < p; j++) {
            r = random.nextInt(COLORS.length * WORDS.length);
            int colorIndex = r / WORDS.length;
            int wordIndex = r % WORDS.length;

            System.out.println(COLORS[colorIndex] + WORDS[wordIndex] + Reset);
            Thread.sleep(t);
            clearScreen();

            b = random.nextInt(2);
            if (b == 0) {
                System.out.println("\nEnter the color:");
                a = scanner.next();
                if (a.equals(WORDS[colorIndex])) {
                    System.out.println("Correct choice\n");
                    score += 10;
                } else {
                    System.out.println("\nYou lost");
                    return score;
                }
            } else {
                System.out.println("\nEnter the word:");
                a = scanner.next();
                if (a.equals(WORDS[wordIndex])) {
                    System.out.println("Correct choice\n");
                    score += 10;
                } else {
                    System.out.println("\nYou lost");
                    return score;
                }
            }
        }
        return score;
    }

    private void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
