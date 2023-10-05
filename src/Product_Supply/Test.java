package Product_Supply;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();

        // Create and add products to the list
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Text Book");
        p1.setPrice(25);
        p1.setQuantity(20);
        p1.setRating(4);
        productList.add(p1);

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Notebook");
        p2.setPrice(5);
        p2.setQuantity(50);
        p2.setRating(4.5);
        productList.add(p2);

        // Display information for all products in the list
        for (Product product : productList) {
            product.displayProductInformation();
        }


        // Supplier Attribute
        Supply s1 = new Supply();
        s1.setId(3);
        s1.setName("Rahul");
        s1.displaySupplierInformation();

    }
}


//constructor