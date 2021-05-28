// This class "loads" rooms into memory.

package game;
import fixtures.Room;

public class RoomManager {
	
	Room startingRoom;					// The room a player starts in
	Room[] rooms = new Room[2];			// All of the rooms in the house
	
	public void init() {
		// Creating our living room object
		Room livingRoom = new Room("\n~*The Living Room*~", "It's a large antique living room.", "To your right, you see a hallway to enter into the only other room in the house.");
		this.rooms[0] = livingRoom;			
		this.startingRoom = livingRoom;		// Living Room is the room we start in.
		
		// Creating our bed room object
		Room bedRoom = new Room("\n~*The Bedroom*~", "It is a medium sized bed room.", "This is where you enjoy taking naps. It is well lit with natural lighting. We can only return back to the living room.");
		this.rooms[1] = bedRoom;			
		
		// 0 is left, 1 is right
		// "Room right of my living room is the bedroom"
		livingRoom.dirChoices[1] = bedRoom;
		bedRoom.dirChoices[0] = livingRoom;
	}
	
	// Get the room you begin in - Note* You do not need to create a setter because you already did that above.
	public Room getStartRoom() {
		return startingRoom;
	}
	
	// Get a list of all of your rooms
	public Room[] getAllRooms() {
		return rooms;
	}

}
