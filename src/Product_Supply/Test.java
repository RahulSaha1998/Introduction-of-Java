package Product_Supply;

public class Test {
    public static void main(String[] args) {

        Product p = new Product();
        Supply s = new Supply();

        // Products Attribute
        p.setId(1);
        p.setName("Text Book");
        p.setPrice(25);
        p.setQuantity(20);
        p.setRating(4);

        int id = p.getId();
        String name = p.getName();
        double price = p.getPrice();
        int quantity = p.getQuantity();
        double rating = p.getRating();

        System.out.println("Product id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Rating : " + rating);




        // Supplier Attribute
        s.setId(3);
        s.setName("Rahul");

        int supplierId = s.getId();
        String supplierName = s.getName();

        System.out.println("Supplier id : " + supplierId);
        System.out.println("Supplier Name : " + supplierName);
    }
}
