package activity93025;

import java.util.Scanner;

public class DrawingClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students: ");
		int students = sc.nextInt();
		System.out.println("Enter Number of Pencils per Student: ");
		int pencils = sc.nextInt();
		
		int totalPencils = students * pencils;
		
		System.out.println("Total Number of Pencils: " + totalPencils);
		
		sc.close();
		
		
	}
	

}
