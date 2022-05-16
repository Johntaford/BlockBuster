import java.util.ArrayList;

public abstract class Movie {
	/*
	 * A field for title that’s a string 
	 * An field for runTime (in minutes) 
	 * An array list of string called scenes
	 * A method called printInfo() that prints all properties in the class to the console except for the scenes. 
	 * A method called printScenes() that prints all the scenes in the list along with their index.
	 * An abstract method with no return type called play()
	 */

	private String title;
	private int runTime;
	private ArrayList<String> scenes = new ArrayList<String>();
	
	public Movie(String title, int runTime, ArrayList<String> scenes) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

	public void printInfo() {
		System.out.println(getTitle());

		System.out.println(getRunTime());

	}

	public void printScene() {
		System.out.println(getScenes());
	}
	abstract public void play();

}

