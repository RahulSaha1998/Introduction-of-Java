package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size = " + number.size());

        // add elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);

        // ----Clear Method

        // number.clear();
        // System.out.println(number);

        // ----isEmpty Method
        // number.clear();
        boolean check = number.isEmpty();
        System.out.println(check);

        // ----Contains Method
        boolean num = number.contains(30);
        System.out.println(num);

        // ----indexOf Method
        int position = number.indexOf(30);
        System.out.println(position);

        // ----set Method //replace
        number.set(3, 50);
        System.out.println(number);

        // ----get Method 
        int x = number.get(0);
        System.out.println(x);
    }
}
