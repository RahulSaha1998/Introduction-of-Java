package Static_Block;

public class StaticBlock {
    static int id;
    static String name;

    //single static block
    static {
        id = 10;
        name = "rahul";
    }

    static void display() {
        System.out.println("id :" + id);
        System.out.println("name :" + name);
    }
}
