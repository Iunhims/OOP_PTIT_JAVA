import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<String, Product> products;

    public Warehouse() {
        products = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, new Product(price, stock));
    }

    public int price(String product) {
        if (products.containsKey(product)) {
            return products.get(product).getPrice();
        }
        return -99;
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        // Add products to the warehouse
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 7);

        // Print prices of products
        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));
    }
}

class Product {
    private int price;
    private int stock;

    public Product(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}