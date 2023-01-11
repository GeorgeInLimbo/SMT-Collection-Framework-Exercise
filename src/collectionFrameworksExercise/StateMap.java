package collectionFrameworksExercise;

import java.util.TreeMap;

/****
 * 
 * <b>Title:</b> StateMap.java<br>
 * <b>Project:</b> collectionFrameworksExercise<br>
 * <b>Description:</b> <br>
 * <b>Copyright:</b> Copyright (c) 2023<br>
 * <b>Company:</b> Silicon Mountain Technologies<br>
 * 
 * @author George Clam
 * @version 1.0
 * @since Jan 10 2023
 * @updates:
 ****/

public class StateMap {

	/**
	 * This main method populates a TreeMap and utilizes methods from the class to display the items in the console in both conventional and reverse order.
	 * @param args
	 */
	public static void main(String[] args) {
		
		StateMap m = new StateMap();
		TreeMap<String, String> states = new TreeMap<>();
		
		states.put("CO", "Colorado");
		states.put("ID", "Idaho");
		states.put("IL", "Illinois");
		states.put("HI", "Hawaii");
		states.put("AK", "Alaska");
		
		m.printMap(states);
		m.printMapReverse(states);
	}
	
	/**
	 * This method prints a TreeMap in it's inherent order.
	 * @param m Takes a parameter of a TreeMap with a requirement for two Strings
	 */
	public void printMap(TreeMap<String, String> m) {
		System.out.println("This is the ordered map:");
		System.out.println(m);
		System.out.println();
	}
	
	/**
	 * 
	 * @param m Takes a parameter of a TreeMap with a requirement for two Strings
	 */
	public void printMapReverse(TreeMap<String, String> m) {
		System.out.println("This is the map in reversed order");
		System.out.println(m.descendingMap());
	}

}
