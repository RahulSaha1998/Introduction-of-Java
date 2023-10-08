package SuperClass;

public class B extends A {
    int x = 10;

    void displayInformation() {
        System.out.println(super.x);
    }

    @Override
    void displayInfo() {
        
        super.displayInfo();
        System.out.println("Inside B class");
    }
}
