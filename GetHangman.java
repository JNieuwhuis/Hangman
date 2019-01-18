package hangman;
import java.util.*;

public class GetHangman {

	Integer count =0;
	boolean isWordGuessed = false; 

	public void getHangman(ArrayList<String> display, ArrayList<String> animalLetters) {

		getArrayLists lists = new getArrayLists();

		while ((isWordGuessed == false) && (count <10))
		{

			String letterin = lists.getInput();

			boolean isLetterDouble = false;

			if (display.contains(letterin)) {
				System.out.println("You have already entered that letter. Try another one."); 
				isLetterDouble = true;
			}

			if (!display.contains(letterin) && (isLetterDouble ==false)) {

				if (animalLetters.contains(letterin)) {

					for (int ch = 0; ch < animalLetters.size(); ch++) {
						if (animalLetters.get(ch).equals(letterin)) {
							display.set(ch, letterin);
						}
					}


					for (String letter: display) {
						System.out.print((letter) + (" "));
					}

					if (display.equals(animalLetters))
					{
						System.out.println(System.lineSeparator()+ "You guessed the right animal! You won! ");
						isWordGuessed = true;
						break;
					}

					System.out.println(System.lineSeparator()+ "You guessed right.");

				}
				else if (!animalLetters.contains(letterin) && (isLetterDouble ==false)) {
					count++;

					for (String letter: display) {
						System.out.print((letter) + (" "));
					}

					System.out.println(System.lineSeparator()+ "You guessed wrong.");

					if (count ==9) {
						System.out.println("You can still enter " +(10-count) + " wrong guess before you're hanged.");
					}

					else if (count <10) {
						System.out.println("You can still enter " +(10-count) + " wrong guesses before you're hanged."); 
					}

				}

				if (count == 10){
					System.out.println(System.lineSeparator()+ "You couln't guess the right animal! You're a hanging man.");					
				}

			}

		}
	}
}

