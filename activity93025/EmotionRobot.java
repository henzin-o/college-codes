package activity93025;

import java.util.Scanner;

public class EmotionRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1 to 4: ");
        int emotion = sc.nextInt();

        switch (emotion) {
            case 1:
                System.out.println("You are happy!");
                break;
            case 2:
                System.out.println("You are sad!");
                break;
            case 3:
                System.out.println("You are angry!");
                break;
            case 4:
                System.out.println("You are surprised!");
                break;
            default:
                System.out.println("Unknown emotion");
        }
        sc.close();
    }
}
