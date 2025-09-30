package activity93025;

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bill Amount: ");
		
		double bill = sc.nextDouble();
		
		double tip = (bill*0.15);
		
		double totalbill = (bill+tip);
		
		System.out.println("Bill Amount: " + bill);
		System.out.println("Tip Calculated: " + tip);
		System.out.println("Total Bill Amount: " + totalbill);
		
		sc.close();
		}
	}