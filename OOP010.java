
import java.util.Scanner;
public class OOP010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Product product1 = new Product("Tape measure");
        Product product2 = new Product("Plaster", "home improvement section");
        Product product3 = new Product("Tyre", 5);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    sc.close();
    }  
}

class Product{
    private String name;
    private String location;
    private int weight;

    public Product(String name){
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }
    public Product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
    }
    public Product(String name, int weight){
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }
    public String toString(){
        return name + " (" + weight + "kg)" + " can be found from the " + location;
    }
}