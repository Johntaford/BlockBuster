import java.util.ArrayList;

public class VHS extends Movie{
	/*
	 * A field called currentTime this will start at 0 and match up with the indexes of the array list of scenes 
	 * An override of play() that "plays" (prints out) the scene at the current time and then increments currentTime. If currentTime is greater than the max index of the array list, call rewind() 
	 * A method called rewind() that returns nothing and sets currentTime to 0.
	 */
	private int currentTime = 0;
	
	/*
	 * public VHS() { super(); }
	 */
	
	public VHS (String title, int runTime,ArrayList<String> scenes) { 
	super(title, runTime, scenes);

}
	@Override
	public void play() {
		if(currentTime < getScenes().size()) {
			System.out.println(getScenes());
		} else if (currentTime >= getScenes().size()) {
			rewind();
		}
		
	}
	public void rewind() {
		this.currentTime = 0;
		
	}
	public int getCurrentTime() {
		return currentTime;
	}

}
