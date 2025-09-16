package Aaron;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Enter your First Name:");
	String firstname = scanner.nextLine();
	
	System.out.println("Enter your Last name initial:");
	String lastnameinitial = scanner.nextLine();
	
	System.out.println("Enter your age: ");
	int age = scanner.nextInt();
	scanner.nextLine();
	
	System.out.println("Enter your height in feet&in: ex: 5.11");
	double h1 = scanner.nextDouble();
	double height = (h1 *0.305);
	
	System.out.println("Enter your weight in kg:");
	double weight = scanner.nextDouble();
	
	
	boolean isStudent = true;
	
	System.out.println("_________________________________________");
	System.out.println("");
	System.out.println("Name:" + firstname);
	System.out.println("Initial:" + lastnameinitial);
	System.out.println("Age:" + age);
	System.out.println("Height:" + height + " feet");
	System.out.println("Is Student:" + isStudent);
	
	
	double bmi = weight / (height*height);
	
	System.out.printf("BMI: %.2f%n",bmi);
	
	if (bmi >=18.5 && bmi <= 24.9) { // nagamit ak sin && para maibutang sa if statement an range 18.5 - 24.9
		System.out.print("Normal BMI");
	}
	else if (bmi >= 25 && bmi <= 29.9) {
		System.out.println("Overweight");
	} 
	else if (bmi >= 30) {
		System.out.println("Obese");
	}
	else if (bmi <=18.5) {
		System.out.println("Underweight");
		
		scanner.close();
	}
	
} 
	
}


