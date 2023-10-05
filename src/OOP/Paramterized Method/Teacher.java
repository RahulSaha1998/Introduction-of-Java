package OOP;

public class Teacher {
    String name, gender;
    int phone;

    // Parameterized Method
    void setInformation(String n, String m, int ph) {
        name = n;
        gender = m;
        phone = ph;
    }

    // Method
    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println("\n\n");
    }
}
