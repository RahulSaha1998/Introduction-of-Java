package Method_Overriding;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Rahul";
        t1.age = 25;
        t1.qualification = "Bsc in CSE";

        t1.displayInformation();

        Person p1 = new Person();
        p1.name = "Rahul";
        p1.age = 25;

        p1.displayInformation();

    }
}
