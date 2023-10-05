package Static_Variable;

public class StaticV {
    static int count = 0;

    StaticV() {
        count++;
    }

    void totalStudent() {
        System.out.println("Total Student: " + count);
    }
}
