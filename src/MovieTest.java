import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MovieTest {

	@Test
	void testDVD () {
	ArrayList<String> FrozenScenes = new ArrayList<>(Arrays.asList("Frozen"));
		
		DVD dvd1 = new DVD("Frozen", 77, FrozenScenes);
		
		assertEquals(dvd1.toString(), new DVD("Frozen", 77, FrozenScenes).toString());
	}
	
	@Test
	void testDVDTitleSetter() {
		
		ArrayList<String> FrozenScenes = new ArrayList<>(Arrays.asList("Frozen"));
		
		DVD dvd1 = new DVD("Frozen", 77, FrozenScenes);
		dvd1.setTitle("P");
		
		assertEquals("P", dvd1.getTitle());
	}
	
	@Test
	void testDVDRuntimeSetter() {
		
		ArrayList<String> FrozenScenes = new ArrayList<>(Arrays.asList("Frozen"));
		
		DVD dvd1 = new DVD("PFrozen", 77, FrozenScenes);
		dvd1.setRunTime(77);
		
		assertEquals(77, dvd1.getRunTime());
	}
	
	@Test
	void testVHSInstanceCreation() {
		
		ArrayList<String> FrozenScenes = new ArrayList<>(Arrays.asList("Frozen"));
		
		VHS vhs1 = new VHS("Frozen", 77, FrozenScenes);
		
		assertEquals(vhs1.toString(), new VHS("Frozen", 77, FrozenScenes).toString());
	}
	
	@Test
	void testVHSTitleSetter() {
		
		ArrayList<String> FrozenScenes = new ArrayList<>(Arrays.asList("Frozen"));
		
		VHS vhs1 = new VHS("Frozen", 77, FrozenScenes);
		vhs1.setTitle("A");
		
		assertEquals("A", vhs1.getTitle());
	}
	
	@Test
	void testVHSRuntimeSetter() {
		
		ArrayList<String> FrozenScenes = new ArrayList<>(Arrays.asList("Frozen"));
		
		VHS vhs1 = new VHS("Frozen", 77, FrozenScenes);
		vhs1.setRunTime(77);
		
		assertEquals(77, vhs1.getRunTime());
	}
	
	@Test
	void testVHSCurrentTimeSetPoint() {
		
		ArrayList<String> FrozenScenes = new ArrayList<>(Arrays.asList("Frozen"));
		
		VHS vhs1 = new VHS("Frozen", 77, FrozenScenes);
		
		assertEquals(0, vhs1.getCurrentTime());
	}
	
	@Test
	void testVHSPlayMethod() {
		
		ArrayList<String> FrozenScenes = new ArrayList<>(Arrays.asList("Frozen"));
		
		VHS vhs1 = new VHS("Frozen", 77, FrozenScenes);
		vhs1.play();
		vhs1.play();
		vhs1.play();
		
		assertEquals(3, vhs1.getCurrentTime());
	}
	
	
	@Test
	void testVHSrewindMethod() {
		
		ArrayList<String> FrozenScenes = new ArrayList<>(Arrays.asList(" Frozen"));
		
		VHS vhs1 = new VHS("Frozen", 77, FrozenScenes);
		vhs1.setRunTime(3);
		vhs1.rewind();
		
		
		assertEquals(0, vhs1.getCurrentTime());
	}
	
	@Test
	void testVHSrewindMethod1() {
		
		ArrayList<String> FrozenScenes = new ArrayList<>(Arrays.asList("Frozen"));
		
		VHS vhs1 = new VHS("Frozen", 77, FrozenScenes);
		vhs1.play();
		vhs1.play();
		vhs1.play();
		vhs1.play();
		
		assertEquals(1, vhs1.getCurrentTime());
		
	}

}
