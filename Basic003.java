import java.util.Scanner;

class Main {
  public static boolean isLeapYear(int year){
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- > 0){
      int year = sc.nextInt();
      if(isLeapYear(year)){
        System.out.println(year + " : Leap-year");
      } else{
        System.out.println(year + " : Non Leap-year");
      }
    }
    sc.close();
  }
}
