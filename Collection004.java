import java.util.*;


class Item {
    private String product;
    private int quantity;
    private int unitPrice;
    private int originalQuantity;
    
    

    public Item(String product, int quantity, int price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
    public Item(String product, int quantity){
        this.quantity = quantity;
        this.product = product;
    }
    public String getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getUnitPrice() {
        return unitPrice;
    }
    public int getOriginalQuantity(){
        return originalQuantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getTotalPrice() {
        return unitPrice * quantity;
    }
    public void printItemInfo(){
        System.out.println("Product: " + product + " has quantity " + quantity + " with price: " + getTotalPrice());
    }
}
class Warehouse {
    private HashMap<String, Item> items;

    class Warehouse() {
        items = new HashMap<String, Item>();
    }
    public void importItem(Item item){
        items.put(item.getProduct(), item);
    }
    public Item getItem(String product) {
        return items.get(product);
    }
    public void removeProduct(String product, int quantity){
        if(items.comtainsKey(product)){
            Item item = items.get(product);
            int Qty = item.getQuantity() - quantity;
            item.setQuantity(Math.max(Qty, 0));
        }
    }
    public void decreaseQuantityInWarehouseByOne(){
        for (Item item : items.values()){
            item.setQuantity(Math.max(item.getQuantity() -1, 0));
        }
    }
    public void
}
