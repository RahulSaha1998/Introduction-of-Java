package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size = " + number.size());

        // add elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(0, 40);

        // System.out.println(number);
        for (int x : number) {
            System.out.print(" " + x);
        }
        System.out.println();
        System.out.println("Size = " + number.size());

    }
}
