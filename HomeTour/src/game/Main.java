/*
 * In Main, we will display prompt, collect input, and parse the input.
 * */

// New things learned: useDelimiter on the scanner
package game;
import java.util.Scanner;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);						// Scanner for collectInput method
	public static String nextAction = "";										// String to obtain the users next choice
	public static boolean gamePlay = true;										// Boolean to continue or exit the game
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		String userChoice = "";
		
		RoomManager mySmallHouse = new RoomManager();							// Create your Room Manager object
		mySmallHouse.init();													// Create your rooms
		Player playerOne = new Player(mySmallHouse.getStartRoom());				// Create your Player object, and get the start room (Living room)
																				
		
		// Welcome the player
		System.out.println("\nWelcome to the virtual tour of my very small house!\n");
		
		// Play the game at least once until the user decides to quit
		while (userChoice.equals("yes") || userChoice.equals("") || userChoice.equals("YES")) {
			printRoom(playerOne);
			String[] parsedWords = collectInput();
			parse(parsedWords, playerOne);
			printRoom(playerOne);
			System.out.println("\nWould you like to keep viewing the house? ");
			userChoice = userInput.nextLine();
		}
		

		// Farewell player and close your scanner
		System.out.println("Thanks for attending my virtual tour!");
		userInput.close();
	}
	

 //Method to print a prompt for the players current room
	public static void printRoom(Player player) {
	System.out.println(player.currentRoom.getName());
	System.out.println(player.currentRoom.getShortDesc());
	System.out.println(player.currentRoom.getLongDesc());
}
	
// Method to acquire user input and divide the string into separate words.
	private static String[] collectInput() {
		// A string to hold every word
		String[] seperateWords = null;
		
		// Ask for and obtain the user input
		System.out.println("\nWhat would you like to do next?");
		nextAction = scanner.nextLine();
		seperateWords = nextAction.split(" ");	// The function .split will actually get every word, and store every word into our String array
		return seperateWords;
	}
	
// Parse the string to determine the users action, update the current room.
	public static void parse(String[] command, Player player){
		
		// Setting the values of our String[] array into variables
		String action = command[0];					
		String direction = command[1];				

		if (action.equals("go")) {
			if (direction.equals("right")) {
				System.out.println("You chose right and opened the bed room door.");
				// Getting the exit to the right of the current room.
				player.currentRoom = player.currentRoom.getExit("right");
				printBR();
			}
			if (direction.equals("left")){
				System.out.println("You chose left and opened the living room door.");
				// Getting the exit to the right of the current room.
				player.currentRoom = player.currentRoom.getExit("left");
				printLR();
			}
		}	
	}

// Print ASCII art of your rooms!
	public static void printLR() {
		System.out.println("         _\r\n"
				+ "      _-'_'-_                               _-'_'-_\r\n"
				+ "   _-' _____ '-_                         _-' _____ '-_\r\n"
				+ "_-' LIVING ROOM '-_                   _-'   BED ROOM '-_\r\n"
				+ " |___|       |___|                     |___|||||||||___|\r\n"
				+ " |___|       |___|                     |___|||||||||___|\r\n"
				+ " |___|   =)  |___|---------------------|___|||||||o|___|\r\n"
				+ " |___|       |___|                     |___|||||||||___|\r\n"
				+ " |___|       |___|                     |___|||||||||___|\r\n"
				+ " |___|       |___|                     |___|||||||||___|");
	}
	
	public static void printBR() {
		System.out.println("         _\r\n"
				+ "      _-'_'-_                               _-'_'-_\r\n"
				+ "   _-' _____ '-_                         _-' _____ '-_\r\n"
				+ "_-' LIVING ROOM '-_                   _-'   BED ROOM '-_\r\n"
				+ " |___|||||||||___|                     |___|       |___|\r\n"
				+ " |___|||||||||___|                     |___|       |___|\r\n"
				+ " |___|||||||o|___|---------------------|___|   =)  |___|\r\n"
				+ " |___|||||||||___|                     |___|       |___|\r\n"
				+ " |___|||||||||___|                     |___|       |___|\r\n"
				+ " |___|||||||||___|                     |___|       |___|");
	}
}
