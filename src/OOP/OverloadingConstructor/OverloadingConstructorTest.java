package OOP.OverloadingConstructor;

public class OverloadingConstructorTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Rahul", "male");
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher("Rahul", "male", 1475258);
        teacher3.displayInformation();
    }
}
