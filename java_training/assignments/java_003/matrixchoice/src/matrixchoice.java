/**
 * 
 */
import java.io.*;
import java.util.Scanner;
/**
 * @author alice
 *
 */
public class matrixchoice {

	private static String[][] rolls = {
			{"Snake eyes", "Australian yo", "Little Joe From Kokomo", "No field five", "Easy six", "Six one you're done"},
			{"Ace caught a deuce", "Ballerina", "The fever", "Jimmie Hicks", "Benny Blue", "Easy eight"},
			{"Easy four", "OJ", "Brooklyn Forest", "Big Red", "Eighter from Decatur", "Nina from Pasadena"},
			{"Little Phoebe", "Easy six", "Skiny McKinney", "Square pair", "Railroad nine", "Big one on the end"},
			{"Sixie from Dixie", "Skinny Dugan", "Easy eight", "Jesse James", "Puppy paws", "Yo"},
			{"The Devil", "Easy eight", "Lou Brown", "Tennessee", "Six five no jive", "Midnight"}
	};
	
	private static String[] concatArrays(String[] a, String[] b) {
		String[] result = new String[a.length + b.length];
		
		int counter = 0;
		for (String item : a) {
			result[counter] = new String(item);
			counter++;
		}
		for (String item : b) {
			result[counter] = new String(item);
			counter++;
		}
		
		return result;
	}
	
	private static void printLine(String[] text) {
		for (String item : text) {
			System.out.printf("%-24s",item);
		}
		System.out.println();
	}
	
	public static void printGrid() {
		String[] firstLine = {"*", "Die 1", "Die 2", "Die 3", "Die 4", "Die 5", "Die 6"};
		printLine(firstLine);
		for (int row=0; row<rolls.length; row++) {
			String[] label = { String.format("Die %d", row+1) };
			printLine( concatArrays(label, rolls[row]) );
		}
	}
	
	private static void printFile() {
		
	}
	
	private static boolean getInput(Scanner scan) {
		String inputString = "";
		while (inputString.length() < 1) {
			inputString = scan.nextLine();
		}
		char input = inputString.charAt(0);
		
		switch (input) {
			case 'q':
				return false;
			case 'Q':
				return false;
			case '1':
				printGrid();
				break;
			case '2':
				printFile();
				break;
			case '3':
				printGrid();
				printFile();
				break;
		}
		return true;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String MESSAGE = "\nOptions - (1) print to screen  (2) print to file  (3) both  (q) quit:";
		
		Scanner scan = new Scanner(System.in);	
		
		do {
			System.out.print(MESSAGE);
		}
		while (getInput(scan));
	}

}
