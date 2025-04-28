import java.util.*;

class Warehouse {
    private HashMap<String, Integer> stocks;
    private HashMap<String,Integer> prices;

    public Warehouse() {
        stocks = new HashMap<String, Integer>();
        prices = new HashMap<String, Integer>();
    }
    public void addProduct(String product, int price, int stock){
        this.stocks.put(product, stock);
        this.prices.put(product, price);
    }
    public int price(String product){
        return prices.getOrDefault(product, -99);
    }
    public int stocks(String product){
        return stocks.getOrDefault(product, 0);
    }
    public boolean take(String product){
        if(stocks.containsKey(product) && stocks.get(product) > 0){
            stocks.put(product, stocks.get(product) -1);
            return true;
        }
        return false;
    }
}
public class Collection002{
    public static void main(String[] args){
        Warehouse wh = new Warehouse();

        wh.addProduct("coffee", 5, 1);

        System.out.println("stock:");
        System.out.println("coffee:  " + wh.stocks("coffee"));
        System.out.println("sugar: " + wh.stocks("sugar"));
        System.out.println("taking coffee " + wh.take("coffee"));
        System.out.println("taking coffee " + wh.take("coffee"));
        System.out.println("taking sugar " + wh.take("sugar"));
        System.out.println("stock:");
        System.out.println("coffee:  " + wh.stocks("coffee"));
        System.out.println("sugar: " + wh.stocks("sugar"));
}
}