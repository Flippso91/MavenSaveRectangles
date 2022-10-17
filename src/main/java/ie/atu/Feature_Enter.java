package ie.atu;

import java.util.Scanner;

public class Feature_Enter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter length");
        double length = input.nextDouble();
        System.out.println("You entered: " + length);

        System.out.println("Please enter width");
        double width = input.nextDouble();
        System.out.println("You entered: " + width);
        System.out.println("Length x Width = " + length + " x " + width);
    }
}
