import java.util.ArrayList;
import java.util.Scanner;
public class DVD extends Movie {
	/*
	 * Create a child of Movie named DVD with the following code: 
	 * An override play() that takes no parameters, is void, and will ask the user what scene they’d
	 * like to watch, print all the available scenes, and allow the user to select a
	 * scene from the list and print it out.
	 */
	
	Scanner input = new Scanner(System.in);
	
	public DVD(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		ArrayList<String> movies = super.getScenes();
		System.out.println("What Scene would you like to watch?");
		super.printScene();
		int userChoice = input.nextInt();
		
		System.out.println("Scene " + userChoice + ": " + movies.get(userChoice));		
	}

}
