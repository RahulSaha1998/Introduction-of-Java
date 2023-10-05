package OOP.Constructor;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Rahul saha", "male", 172987972);
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Jack Saha", "male", 1289128912);
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();

    }
}
