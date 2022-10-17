package ie.atu;

import java.util.Scanner;

public class Feature_Enter {
    public static void main(String[] args) {
        System.out.println("Please enter length");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("You entered: " + length);

    }
}
