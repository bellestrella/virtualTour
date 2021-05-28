/*
 This abstract class will be used as a base for anything
 that can be looked at or interacted with. Recall, abstract
 classes are not implemented.
 */

package fixtures;

public abstract class Fixture {

	String name;				// A short name or title for a fixture
	String shortDescription;	// A one sentence description of a fixture
	String longDescription;		// A paragraph description of the fixture when the player investigates it (thing or room)
	
	
	// Define the constructor that takes in the arguments
	public Fixture(String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	// Getters to retrieve your properties
	public String getName() {
		return name;
	}

	public String getShortDesc() {
		return shortDescription;
	}

	public String getLongDesc() {
		return longDescription;
	}

}
