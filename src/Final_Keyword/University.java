package Final_Keyword;

public class University {
    final String UNIVERSITY_NAME = "AIUB"; // final means not changeable
    final int fees; // blank final variable
    static final int credit; // Static blank final variable

    University() {
        fees = 25000;
    }

    static {
        credit = 5;
    }

    void display() {
        System.out.println(UNIVERSITY_NAME);
        System.out.println(fees);
        System.out.println(credit);
    }
}
