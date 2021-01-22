import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is a simple program that "
				+ "has the simple calculator fucntions.");

		// input reads in user input
		Scanner input = new Scanner(System.in);
		int userInput = 0;
		double answer = 0;
		double num1 = 0, num2 = 0;
		char userChoice;
		boolean stopRunning = false;
		
		
		while (!stopRunning) {
			System.out.println("Calculator choices: ");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.print("Select Choice ");
			userInput = input.nextInt();
			System.out.println();
			System.out.print("Enter first number: ");
			num1 = input.nextDouble();
			System.out.print("Enter second number: ");
			num2 = input.nextDouble();
			
			if (userInput == 1) {
				add(num1, num2);
			} else if (userInput == 2) {
				subtract(num1, num2);				
			} else if (userInput == 3) {
				answer = multiply(num1, num2);
				System.out.println(num1 + " * " + num2 + " = " + answer);
			} else if (userInput == 4) {
				answer = divide(num1, num2);
				System.out.println(num1 + " / " + num2 + " = " + answer);
			} else {
				System.out.println("Invalid choice.");
			}
			
			System.out.println("Do you want to calculate again? (y or n) ");
			userChoice = input.next().charAt(0);
			if (userChoice == 'y') {
				stopRunning = false;
			} else if (userChoice == 'n') {
				stopRunning = true;
			}
			
		}
	}
	
	public static void add(double num1, double num2) {
		double answer = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + answer);
	}
	
	public static void subtract(double num1, double num2) {
		double answer = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + answer);
	}
	
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double divide(double num1, double num2) {
		return num1 / num2;
	}
}
