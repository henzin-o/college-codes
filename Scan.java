package Aaron;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter your name:");
	String name = scanner.nextLine();
	System.out.println("Hello! " + name +", How can I help you?");
	scanner.close();
	}

}
