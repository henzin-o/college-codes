package Aaron; //Activity 9

import java.util.Scanner;

public class CalculatorMenu {

	public static void main(String[] args) {
	
	////Unnecessary Part (CALCULATOR START MENU TOP LINE)
	
	System.out.println("Welcome to My Calculator!");
	System.out.println("");
	System.out.println("___________________________");
	System.out.println("");
	System.out.println("Start? Y/N");
	
	
	Scanner scanner = new Scanner(System.in);
	
	char choice = scanner.next().charAt(0);
	switch (choice) {
	case 'Y' :
		System.out.println("Calculator Initialized!");
		System.out.println("");
		calculatorMenu(scanner);
		break;
	case 'N' :
		System.out.println("Exiting...");
		break;
	default:
		System.out.println("Invalid choice.. Exiting...");
		break;
	}
	scanner.close();
	}
	
	//Unnecessary Part (CALCULATOR START MENU BOTTOM LINE)
	
	public static void calculatorMenu(Scanner scanner) {
	
	System.out.println("Enter First Number: ");
	double x = scanner.nextDouble();
	System.out.println("Enter Second Number: ");
	double y = scanner.nextDouble();
	System.out.println("Select Operation: +, -, *, /");
	char operation = scanner.next().charAt(0);
	
	
	String operatorUsed = "";
	if (operation == '+') {
		operatorUsed = "Addition was used";
	}
	else if (operation == '-') {
		operatorUsed = "Subtraction was used";
	}
	else if (operation == '*') {
		operatorUsed = "Multiplication was used";
	}
	else if (operation == '/') {
		operatorUsed = "Division was used";
	}
	
	else {
		System.out.println("Invalid Input");
	}	
	
	
	double result;
	
	
	switch (operation) {
	case '+': result = x + y;
	break;
	case '-': result = x - y;
	break;
	case '*': result = x * y;
	break;
	case '/': result = x / y;
	break;
	default: System.out.println("Invalid Operation");
	return; }
	
	
	
	
	if(result%2==0) {
	System.out.println("The Answer is Even");
		}
		else {
	System.out.println("The Answer is Odd");
		}

	System.out.println(operatorUsed);
	System.out.println("Result: " + result);
	
	
	
	}
	
	
	
}

	
	