import java.util.Scanner;

public class Main{
    public static int checkQty(int qty) throws Exception{
        if(qty <= 0){
            throw new Exception(" Qty khong duoc be hon 0");
        }
        return qty;
    }
    public static String checkName(String name) throws Exception{
        if(name == null || name.length() > 20 ){
            throw new Exception("Name khong duoc trang va khong duoc qua 20 ky tu");
        }
        return name;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int qty = sc.nextInt();
    
        try{
            System.out.println(checkQty(qty));
            System.out.println(checkName(name));
        }
        catch (Exception e){
            System.out.println(e.getMessage());  
        }
    }
}