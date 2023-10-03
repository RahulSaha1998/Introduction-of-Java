package Product;

class ProductDetails {
    int id;
    String name;
    double price;
    int quantity;
    double rating;

    public void printDetails() {
        System.out.println("id is:" + id);
        System.out.println("name:" + name);
        System.out.println("Quantity:" + quantity);
        System.out.println("Rating:" + rating);
    }

    public double getPrice(){
        return price;
    }
}

public class Product {   
    public static void main(String[] args) {
        System.out.println("Hello From Product");
        ProductDetails pen = new ProductDetails(); // Instantiating a new Employee Object
        ProductDetails book = new ProductDetails(); // Instantiating a new Employee Object

        // Set Pen Attributes
        pen.id = 1;
        pen.name = "Matador";
        pen.price = 10.0;
        pen.quantity = 7;
        pen.rating = 5.0;

        // Set Book Attributes
        book.id = 2;
        book.name = "Biology";
        book.price = 12.0;
        book.quantity = 3;
        book.rating = 4.0;

        pen.printDetails();
        book.printDetails();

        double price = book.getPrice();
        System.out.println(price);
    }
}
