package collectionFrameworksExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/****
 * 
 * <b>Title:</b> PeopleList.java<br>
 * <b>Project:</b> collectionFrameworksExercise<br>
 * <b>Description:</b> This class utilizes the Person class to create an ArrayList of old SNL guys in the given order and then a shuffled order.<br>
 * <b>Copyright:</b> Copyright (c) 2023<br>
 * <b>Company:</b> Silicon Mountain Technologies<br>
 * 
 * @author George Clam
 * @version 1.0
 * @since Jan 10 2023
 * @updates:
 ****/

public class PeopleList {

	/**
	 * Builds an ArrayList and then displays the list in the console in an ordered list and then a shuffled list
	 * @param args
	 */
	public static void main(String[] args) {
		PeopleList p = new PeopleList();
		ArrayList<Person> people = new ArrayList<>();

		Person p1 = new Person("John", "Belushi");
		Person p2 = new Person("Chevy", "Chase");
		Person p3 = new Person("Bill", "Murray");
		Person p4 = new Person("Steve", "Martin");

		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);

		p.displayList(people);
		p.displayShuffleList(people);
	}
	
	/**
	 * This method takes an Array List and prints it to the console in its inherent order
	 * @param p Takes a paramater of an List of Person objects.
	 */
	public void displayList(List<Person> p) {
		System.out.println("List in original order:");
		for (int i = 0; i < p.size(); i++) {
			printPerson(p.get(i));
		}
		System.out.println();
	}

	/**
	 * This method takes an Array list, shuffles the order and prints the shuffled list to the console.
	 * @param p Takes a paramater of an List of Person objects.
	 */
	public void displayShuffleList(List<Person> p) {
		System.out.println("Shuffled List:");
		shuffleList(p);
		for (int i = 0; i < p.size(); i++) {
			printPerson(p.get(i));
		}
	}

	/**
	 * This method deconstructs a Person object's state into a consumable format (ID, First Name, Last Name).
	 * @param p Takes a parameter of a single instance of a Person object
	 */
	public void printPerson(Person p) {
		System.out.print(p.getId() + " ");
		System.out.print(p.getFirstName() + " ");
		System.out.print(p.getLastName() + " ");
		System.out.println();
	}

	/**
	 * This method shuffles a given ArrayList for a Person object
	 * @param p Takes a paramter of a single instance of a Person object
	 */
	public void shuffleList(List<Person> p) {
		Collections.shuffle(p);
	}
}
