package InputDemo;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        String name;
        double num1;

        System.out.println("Enter any double value:");
        num1 = input.nextDouble();
        System.out.println("double value: " + num1);

        // Integer Input-------------------

        // System.out.print("Enter any number : ");
        // number = input.nextInt();
        // System.out.println("Number = " + number);

        // String Input--------------------

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.println("Welcome = " + name);

    }

}
