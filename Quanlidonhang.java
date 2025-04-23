import java.util.Scanner;


class Product {
    private String productId;
    private String name;
    private double price;

    public Product (String productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public String getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
class Order {
    private String orderId;
    private Product product;
    private int quantity;

    public Order(String orderId, Product product, int quantity){
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }
    public double calculateTotal(){
        return quantity * product.getPrice();
    }
    public void display(){
        System.out.println("--- Thông tin đơn hàng ---");
        System.out.println("Đơn hàng: " + orderId);
        System.out.println("Sản phẩm: " + product.getName() +" (Mã: " + product.getProductId() + ")" );
        System.out.printf("Giá: %.1f\n", product.getPrice());
        System.out.println("Số lượng: " + quantity);
        System.out.printf("Tổng tiền: %.1f", calculateTotal());
    }
}
public class Quanlidonhang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String productId = sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        sc.nextLine();
        Product product = new Product(productId, name, price);

        String orderId = sc.nextLine();
        int quantity = sc.nextInt();
        sc.nextLine();
        Order order = new Order(orderId, product, quantity);
        order.display();
    }
}
