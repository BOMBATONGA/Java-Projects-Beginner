package game;

public class Main {
	public static void main(String[] args) {
		int randomNumber, guessesCount, result, tries = 0;
		
		Announcer.Welcome();

		guessesCount = Announcer.Difficulty();
		
		do {
			
			randomNumber = Game.RandomNumber();
			result = Game.Start(guessesCount, randomNumber);
		
			if(result == 0) {
				Announcer.Loss(randomNumber);
			} else {
				tries = guessesCount - result + 1;
				Announcer.Victory(tries);
			}
			
		} while(Announcer.TryAgain(tries) != 0);
		
		Announcer.GoodBye();
	}
	
	
	
}
