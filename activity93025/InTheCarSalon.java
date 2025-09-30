package activity93025;

import java.util.Scanner;

public class InTheCarSalon {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Car Price: ");
		
		double price = sc.nextDouble();
		
		if (price <= 12000) {
			System.out.println("enough");
		} else
			System.out.println("");
		
		sc.close();
		
	}

}
