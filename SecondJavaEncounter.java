package Aaron;

import java.util.Scanner;

public class SecondJavaEncounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int x = scanner.nextInt();
		if(x%2==0) {
System.out.println("even");
		}
		else
System.out.println("odd");
		scanner.close();
	}

}
