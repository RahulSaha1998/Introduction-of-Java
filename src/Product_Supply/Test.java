package Product_Supply;

public class Test {
    public static void main(String[] args) {

        Product p = new Product();
        Supply s = new Supply();

        // Set Product Attributes
        p.id = 1;
        p.name = "Matador";
        p.price = 10.0;
        p.quantity = 7;
        p.rating = 5.0;

        p.printProductDetails();

        // Set Supply Attributes
        s.id = 10;
        s.name = "Dhaka";
        s.printSupplyDetails();

    }
}
