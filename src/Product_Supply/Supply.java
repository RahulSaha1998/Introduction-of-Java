package Product_Supply;

public class Supply {
    private int id;
    private String name;

    // Get and Set for id
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Get and Set for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void displaySupplierInformation() {
        System.out.println("Supplier id : " + id);
        System.out.println("Supplier Name : " + name);
    }
}
