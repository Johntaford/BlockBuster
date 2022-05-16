import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int userInput;
		String userContinue = "yes";
		
		ArrayList<String> ShrekScenes = new ArrayList<>(Arrays.asList("Shrek"));
		ArrayList<String> FindingNemoScenes = new ArrayList<>(Arrays.asList("Finding Nemo"));
		ArrayList<String> PanScenes = new ArrayList<>(Arrays.asList("Pan"));
		ArrayList<String> ToyScenes = new ArrayList<>(Arrays.asList("Toy Stroy"));
		ArrayList<String> CheaperScenes = new ArrayList<>(Arrays.asList("Cheaper by the Dozen"));
		ArrayList<String> FrozenScenes = new ArrayList<>(Arrays.asList("Frozen"));
		
		ArrayList<Movie> movies = new ArrayList<>();
		
		movies.add(new VHS("Shrek", 169, ShrekScenes));
		movies.add(new VHS("Finding Nemo", 80, FindingNemoScenes));
		movies.add(new VHS("Pan", 178, PanScenes));
		movies.add(new DVD("Toy Story", 120, ToyScenes));
		movies.add(new DVD("Cheaper by the Dozen", 190, CheaperScenes));
		movies.add(new DVD("Frozen", 77, FrozenScenes));
		
		do {
		printMenu();
		userInput = scan.nextInt();
		
		if(userInput == 1) {
			movies.get(userInput).play();	
		} else if (userInput == 2) {
			movies.get(userInput - 1).play();
		} else if (userInput == 3) {
			movies.get(userInput - 1).play();
		} else if (userInput == 4) {
			movies.get(userInput - 1).play();
		} else if (userInput == 5) {
			movies.get(userInput - 1).play();
		} else if (userInput == 6) {
			movies.get(userInput - 1).play();
		}
		
		if(userInput > 0 && userInput <= 3) {
			System.out.println("Thank you for selecting a VHS!");
		} else {
			System.out.println("You chose a DVD!");
		}
		
		System.out.print("Would you like to chose another movie? (y/n): ");
		userContinue = scan.next();
		System.out.println();
	
		
		} while (userContinue.equals("yes"));
		
	System.out.println("Thank you");

	}
	
	public static void printMenu() {
		System.out.println("Hello! Please select a movie!");
		System.out.println("1. Shrek");
		System.out.println("2. Finding Nemo");
		System.out.println("3. Pan");
		System.out.println("4. Toy Story");
		System.out.println("5. Cheaper by the Dozen");
		System.out.println("6. Frozen");
		System.out.print("Which movie would you like? (1-6): ");
	}

}
