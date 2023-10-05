package Static_Keyword;

public class Student {
    String name;
    int id;
    static String universityName = "AIUB"; // Static or Class variable

    Student(String n, int i) {
        name = n;
        id = i;
    }

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("University: " + universityName);
        System.out.println("\n\n");
    }
}
