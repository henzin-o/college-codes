package Aaron;

import java.util.Scanner;

public class MyCourse {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name:");
			String name = scanner.nextLine();
		
		System.out.println("Enter your age:");
			int age = scanner.nextInt();
				scanner.nextLine();
		
		System.out.println("Enter your address:");
			String location = scanner.nextLine();
		
		System.out.println("Enter your year and section:");
			String section = scanner.nextLine();
		
		System.out.println("Enter your full course name:");
			String course = scanner.nextLine();
		
		System.out.println("Enter Lab Date:");
			String date = scanner.nextLine();
		
		System.out.println("Enter Lab Time:");
			String time = scanner.nextLine();
		
		System.out.println("_________________________________________________________");
		System.out.println("");
		System.out.println("My Name is " + name + " I am " + age + ", I live in " + location + " I am a student under section " + section + " studying " + course);
		System.out.println("");
		
		System.out.println("Subject: Computer Programming 1");
		System.out.println("Lab Day:" + date);
		System.out.println("Lab Time:" + time);
		
		scanner.close();		
	}

}
