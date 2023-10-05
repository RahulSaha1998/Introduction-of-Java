package OOP;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(); // create teacher
        Teacher teacher2 = new Teacher(); // create teacher

        // teacher1.name = "Rahul Saha";
        // teacher1.gender = "male";
        // teacher1.phone = 017201;
        teacher1.setInformation("Rahul saha", "male", 01722);
        teacher1.displayInformation();

        teacher2.setInformation("Jack Saha", "male", 0445454);
        teacher2.displayInformation();

    }
}
