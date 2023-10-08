package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size = " + number.size());

        // add elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);

        /*
         * For Each Loop
         * for (int i : number) {
         * System.out.print(" " + i);
         * }
         * 
         */

        // Iterator System
        /*
         * Iterator itr = number.iterator();
         * while (itr.hasNext()) {
         * System.out.print(" " + itr.next());
         * }
         * 
         */

        // System.out.println();
        // System.out.println("Size = " + number.size());

        System.out.println(number);
        number.remove(2);
        System.out.println(number);

        number.removeAll(number);
        System.out.println(number);

    }
}
