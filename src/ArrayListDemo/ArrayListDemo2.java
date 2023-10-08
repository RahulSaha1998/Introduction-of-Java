package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<Integer>();
        ArrayList<Integer> number2 = new ArrayList<Integer>();
        ArrayList<Integer> number3 = new ArrayList<Integer>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        System.out.println("Number 1 :" + number1);

        number2.add(1);
        number2.add(2);
        number2.add(3);
        System.out.println("Number 2 :" + number2);

        // ----addAll Method
        number3.addAll(number1);
        System.out.println("Number 3 :" + number3);

        // ----equals Method
        boolean result = number1.equals(number3);
        System.out.println(result);

    }
}
