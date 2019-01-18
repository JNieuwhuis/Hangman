package hangman;
import java.util.*;

public class Hangman {

	public String getWord() 
	{		
		ArrayList<String> animalList = new ArrayList<String>();
		animalList.addAll(Arrays.asList("Alligator", "Ant", "Bear", "Bee", "Bird", "Camel", "Cat", "Cheetah", "Chicken", 
				"Chimpanzee", "Cow", "Crocodile", "Deer", "Dog", "Dolphin", "Duck", "Eagle", "Elephant", "Fish", "Fly",
				"Fox", "Frog", "Giraffe", "Goat", "Goldfish", "Hamster", "Hippopotamus", "Horse", "Kangaroo", "Kitten", "Lion",
				"Lobster", "Monkey", "Octopus", "Owl", "Panda", "Pig", "Puppy", "Rabbit", "Rat", "Scorpion", "Seal", "Shark", 
				"Sheep", "Snail", "Snake", "Spider", "Squirrel", "Tiger", "Turtle", "Wolf", "Zebra")); 		
		//System.out.println(animalList);
		String animal = animalList.get(new Random().nextInt(animalList.size())).toLowerCase();
		//System.out.println("I chose this animal: " + animal);
		return animal;
	}	
	
	
	public static void main(String[] args)
		{	
		System.out.println("Let's play a Hangman game! ");
		System.out.println("Can you guess the animal I'm thinking of? ");
		
		Hangman animal = new Hangman();
		String animalWord = animal.getWord();
		
		getArrayLists lists = new getArrayLists();
		GetHangman hangmanGame = new GetHangman();
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> animalLetters = lists.getAnimalLetters(animalWord);
		ArrayList<String> display = lists.getDisplay(animalLetters);
		
		hangmanGame.getHangman(display, animalLetters);
		input.close();
	
		}	
}
//Things to work on: give error response if the wrong letter has already been entered before, control for numerical input.