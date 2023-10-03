package HashMapDemo;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //put, get
        HashMap <Integer, String> customer = new HashMap<Integer, String>();

        customer.put(101, "Rahul");
        customer.put(102, "Rio");
        customer.put(103, "Jack");

        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
    }
}
