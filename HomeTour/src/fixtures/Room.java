/*
 This class represents a room in the house. It will extend Fixture
 and therefore inherit the descriptive properties. Room will also have
 the following properties below.
 */

// Improvements-to-do: Ignore case sensitivity on the String direction

package fixtures;

public class Room extends Fixture {

	public Room[] dirChoices = new Room[2];	// An array of size 2 to indicate what choices we have as far as directions. For now, only right or left.
	
	// Every room has a name, short description, and a long description.
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	
	// Returning a room
	public Room getExit(String direction) {
		int index = 0;
		
		// Because we only have two rooms, we only have two choices to make. 
		
		// Into the living room
		if (direction.equals("left")) {
			index = 0;
		}
		// Into the Bedroom
		else if (direction.equals("right")) {
			index = 1;
		}	
		// Return the index that corresponds to the correct room depending on what the user passes.
		return dirChoices[index];	
	}

	// Getter and Setter
	public Room[] getDirChoices() {
		return dirChoices;
	}

	public void setDirChoices(Room[] dirChoices) {
		this.dirChoices = dirChoices;
	}
	
	
}

	


	
	
//	// In a setter, we pass in what we want to set.
//	public void setExits(Room[] exits) {
//		this.exits = exits;
//	}
//	
//	// In this getter, we simply return all of the exits, hence the array of Rooms.
//	public Room[] getExits() {
//		return this.exits;
//	}
//	
//	
//	// Getter for a particular exit given a direction in Main
//	// Determine here what directions you will use and what index they belong to.
//	public Room getExit(String direction) {
//		int index = 0;
//		
//		// If & else-if statements for all four directions used
//		if (direction == "north") {
//			index = 0;
//		}
//		else if (direction == "south") {
//			index = 1;
//		}
//		else if (direction == "east") {
//			index = 2;
//		}
//		else if (direction == "west") {
//			index = 3;
//		}
//		
//		// exits is the name of your array. Return the index that corresponds to the correct room depending on what the user passes.
//		return exits[index];	
//	}
//}
