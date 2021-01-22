import java.util.Scanner;

public class DisplayPhrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput;
		int phraseLength;
		int numA = 0, numE = 0, numI = 0, numO = 0, numU = 0;
		// variable s is just for user to press any key to continue
		Scanner s = new Scanner(System.in);

		// input reads in user input
		Scanner input = new Scanner(System.in);

		// welcome message
		System.out.println("The program will print out display the phrase you type differently");
		System.out.println();
		System.out.println("Press enter to continue...");
		s.nextLine();

		System.out.print("Enter a phrase: ");
		userInput = input.nextLine();

		phraseLength = userInput.length() - 1;
		for (int i = 0, j = 0; i <= phraseLength; i++, j++) {
			System.out.println(i + " : " + userInput.charAt(j));
			if (userInput.charAt(j) == 'a' || userInput.charAt(j) == 'A') {
				numA++;
			} else if (userInput.charAt(j) == 'e' || userInput.charAt(j) == 'E') {
				numE++;
			} else if (userInput.charAt(j) == 'i' || userInput.charAt(j) == 'I') {
				numI++; 
			} else if (userInput.charAt(j) == 'o' || userInput.charAt(j) == 'O') {
				numO++;
			} else if (userInput.charAt(j) == 'u' || userInput.charAt(j) == 'U') {
				numU++;
			}
		}
		
		System.out.println("This phrase contains: ");
		System.out.println(numA + "'A's");
		System.out.println(numE + "'E's");
		System.out.println(numI + "'I's");
		System.out.println(numO + "'O's");
		System.out.println(numU + "'U's");
	}
}
