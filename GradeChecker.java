package Aaron;

import java.util.Scanner;

public class GradeChecker {
	public static void main(String[] args) {
		System.out.println("Enter Grade:");
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();
		scanner.close();
		
		if (grade>=101) {
			System.out.println("Invalid Grade");
		}
		
		else if (grade >=75) {
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
			
			
		}
	}
}
