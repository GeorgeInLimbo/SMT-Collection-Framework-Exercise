package collectionFrameworksExercise;

/****

<b>Title:</b> Person.java<br>
<b>Project:</b> collectionFrameworksExercise<br>
<b>Description:</b> This class provides a blueprint for a Person object.<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author George Clam
@version 1.0
@since Jan 10 2023
@updates: ****/

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private static int count = 1; 
	
	/**
	 * Constructor for a Person object that assigns an ID and sets the value of the firstName and lastName through the constructor parameters.
	 * @param firstName
	 * @param lastName
	 */
	public Person(String firstName, String lastName) {
		this.id = count;
		this.firstName = firstName;
		this.lastName = lastName;
		count++;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

}
