package Product_Supply;

public class Product {
    int id;
    String name;
    double price;
    int quantity;
    double rating;

    public void printProductDetails() {
        System.out.println("Print from Product");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("Quantity:" + quantity);
        System.out.println("Rating:" + rating);
    }
}
