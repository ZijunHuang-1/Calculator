import java.util.Scanner;

public class PoemProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput = 1;
		boolean validInput = true;
		// variable s is just for user to press any key to continue
		Scanner s = new Scanner(System.in);

		// input reads in user input
		Scanner input = new Scanner(System.in);

		// welcome message
		System.out.println("The program will print out \"Monday's child poem\" with the input you choose");
		System.out.println();
		System.out.println("Press enter to continue...");
		s.nextLine();
		
		while (userInput !=0) {
			System.out.println();
			System.out.print("Enter a number (0 to quit) : ");
			userInput = input.nextInt();

			// printing poem lines determine by random number
			if (userInput == 1) {
				System.out.println("Monday's child is fair of face");
			} else if (userInput == 2) {
				System.out.println("Tuesday's child is full of grace");
			} else if (userInput == 3) {
				System.out.println("Wednesday's child is full of woe");
			} else if (userInput == 4) {
				System.out.println("Thursday's child has far to go");
			} else if (userInput == 5) {
				System.out.println("Friday's child is loving and giving");
			} else if (userInput == 6) {
				System.out.println(" Saturday's child works hard for its living");				
			} else if (userInput == 7) {
				System.out.println("But the child that is born on the Sabbath day is bonny and blithe, and good and gay");
			} else if (userInput == 0) {
				System.out.println();
			} else {
				System.out.print("Sorry, invalid number");
			}
		}

}

}