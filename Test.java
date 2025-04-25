import java.util.HashMap;

class Warehouse{
    private HashMap<String, Integer> hashMap;

    public Warehouse() {
        hashMap = new HashMap<String, Integer>();
    }
    public void addProduct(String product, int price, int stock) {
        this.hashMap.put(product, price);
    }
    public int price(String product){
        if(hashMap.containsKey(product)){
            return hashMap.get(product);     
        }
            return -99;
    }
}
public class Test{
    public static void main(String[] args){
        Warehouse wh = new Warehouse();
        wh.addProduct("milk", 3, 10);
        wh.addProduct("coffee",5, 7);

        System.out.println("prices:");
        System.out.println("milk: " + wh.price("milk"));
        System.out.println("coffee: " + wh.price("coffee"));
        System.out.println("sugar: " + wh.price("sugar"));
    }
}