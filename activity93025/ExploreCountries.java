package activity93025;

import java.util.Scanner;

public class ExploreCountries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Population: ");
        int population = sc.nextInt();
        System.out.println("Enter Area(Hectares): ");
        int area = sc.nextInt();

        if (population < 10000 && area < 10000) {
            System.out.println("small country");
        }
        sc.close();
    }
}
