package collectionFrameworksExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/****
 * 
 * <b>Title:</b> transformArray.java<br>
 * <b>Project:</b> collectionFrameworksExercise<br>
 * <b>Description:</b>This class demonstrates how an Array can be converted to an ArrayList. <br>
 * <b>Copyright:</b> Copyright (c) 2023<br>
 * <b>Company:</b> Silicon Mountain Technologies<br>
 * 
 * @author George Clam
 * @version 1.0
 * @since Jan 10 2023
 * @updates:
 ****/

public class TransformArray {
	
	private String[] strongDudes = { "The Rock", "Arnold Schwarzenegger", "Batman", "George Clam"};

	/**
	 * This main method transforms an Array to an ArrayList and prints it to the console with a class method
	 * @param args
	 */
	public static void main(String[] args) {
		TransformArray list = new TransformArray();
		List<String> toArrayList = new ArrayList<> (Arrays.asList(list.strongDudes));
		list.printArrayList(toArrayList);
	}
	
	/**
	 * This method is used to print an ArrayList to the console.
	 * @param li
	 */
	public void printArrayList(List<String> li) {
		System.out.println("This is an ArrayList of super strong guys built with elements from an array:");
		System.out.println(li);
	}
	
	/**
	 * @return the strongDudes Array
	 */
	public String[] getStrongDudes() {
		return strongDudes;
	}

}
