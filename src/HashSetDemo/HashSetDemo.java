package HashSetDemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> fruitName = new HashSet<String>();
        fruitName.add("Apple");
        fruitName.add("Orange");
        fruitName.add("Banana");

        System.out.println(fruitName.size());

        fruitName.remove("Apple");
        System.out.println(fruitName);

        fruitName.clear();
        System.out.println(fruitName);

        boolean value = fruitName.isEmpty();
        System.out.println(value);
    }
}
