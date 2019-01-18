package hangman;
import java.util.*;


public class getArrayLists {

	public String getInput()
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(System.lineSeparator());
		System.out.println("Enter your letter: ");
		String letterin = input.next().toLowerCase();
		return letterin;
	}

	public ArrayList<String> getAnimalLetters(String animalWord) 
	{		
		ArrayList<String> animalLetters = new ArrayList<String>();
		animalLetters.addAll(Arrays.asList(animalWord.split("")));
		//System.out.println(animalLetters);
		return animalLetters;
	}	
		
	public ArrayList<String> getDisplay(ArrayList<String> animalLetters)
	{
		ArrayList<String> display = new ArrayList<String>();
		
		for (@SuppressWarnings("unused") String letter : animalLetters) {
			display.addAll(Arrays.asList(" _  "));
		}
		for (String letter: display) {
			System.out.print((letter) + (" "));
		}
		System.out.println(System.lineSeparator());
		return display;
	}

}	