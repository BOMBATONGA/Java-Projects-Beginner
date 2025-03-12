package game;

import java.util.Scanner;

public class Game {
	public static int Start(int chances, int randomNumber) {
		int totalChances = chances, hintCount = 1, userGuess;
		Scanner scanner = new Scanner(System.in);
		
		long startTime = System.currentTimeMillis();
		
		while(chances > 0) {
			System.out.print("Enter your guess: ");
			userGuess = scanner.nextInt();
			
			if(userGuess == randomNumber) {
				
				TimeTaken(startTime);
				
				System.out.print("\n");
				return chances;
				
			} else {
				if(userGuess > randomNumber) {
					System.out.println("Incorrect! The number is less than " + userGuess + ".\n");
				} else {
					System.out.println("Incorrect! The number is greater than " + userGuess + ".\n");
				}
				if (chances < 3) {
					System.out.println("Hint: The guess is between " + (randomNumber - (int)(Math.random()*3) - 1) + " and " + (randomNumber + (int)(Math.random()*3) + 1));
					hintCount--;
				}
				chances--;
			}
		}
		
		TimeTaken(startTime);
		return 0;
	}
	
	public static int RandomNumber() {
		return (int)(Math.random() * 101 + 1);
	}
	
	public static void TimeTaken(long startTime) {
		long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;
        System.out.print("\nTime taken: " + totalTime + " seconds.");
	}
}
