// This class represents the player moving through the rooms.

package game;
import fixtures.Room;

public class Player {
	public Room currentRoom;	// The room the player is currently in.
	
	// This will set the room the player is currently in.
	public Player(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	// This will return the room the player is currently in.
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
}
