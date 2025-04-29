import java.util.*;

class Warehouse {
    private HashMap<String, Integer> prices;
    private HashMap<String, Integer> stocks;

    public Warehouse() {
        prices = new HashMap<String, Integer>();
        stocks = new HashMap<String, Integer>();
    }
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product){
        return prices.getOrDefault(product, -99);
    }
    public int stock(String product){
        return stocks.getOrDefault(product, 0);
    }
    public boolean take(String product){
        if(stocks.containsKey(product) && stocks.get(product) > 0){
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }
        return false;
    }
    public Set<String> products() {
        return new HashSet<>(stocks.keySet());
    }
}


public class Collection003 {
    public static void main(String[] args){
        Warehouse wh = new Warehouse();
        wh.addProduct("milk", 3, 10);
        wh.addProduct("coffee", 5,6);
        wh.addProduct("buttermilk", 2, 2);
        wh.addProduct("yogurt",2, 20);
        
        wh.take("buttermilk");
        wh.take("milk");
        wh.take("buttermilk");

        System.out.println("products set:" + wh.products());

        for (String product : wh.products()) {
            if (wh.stock(product) > 0) {
            System.out.println(product);
            }
        }
    }
}