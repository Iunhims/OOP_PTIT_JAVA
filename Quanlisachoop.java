import java.util.Scanner;

class Book {
    private String bookid;
    private String title;
    private String author;

    public Book(String bookid, String title, String author){
        this.bookid = bookid;
        this.title = title;
        this.author = author;
    }
    public String getBookid(){
        return bookid;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}
class Borrow {
    private String borrowid;
    private Book book;
    private String borrower;
    private int days;

    public Borrow(String borrowid, Book book, String borrower, int days){
        this.borrowid = borrowid;
        this.book = book;
        this.borrower = borrower;
        this.days = days;
    }
    public double calculateFee(){
        return days * 5000;
    }
    public void display(){
        System.out.println("--- Phiếu mượn sách ---");
        System.out.println("Mã phiếu: " + borrowid);
        System.out.println("Người mượn: " + borrower);
        System.out.println("Sách: " + book.getTitle() + " (Mã: " + book.getBookid() + ") - " + book.getAuthor());
        // Sách: Dế Mèn Phiêu Lưu Ký (Mã: B001) - Tô Hoài
        System.out.println("Số ngày mượn: " + days);
        System.out.printf("Phí mượn: %.1f", calculateFee());
    }
}

public class Quanlisachoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String bookid = sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
         
        Book book = new Book(bookid, title, author);

        String borrowid = sc.nextLine();
        String borrower = sc.nextLine();
        int days = sc.nextInt();
        sc.nextLine();
        Borrow borrow = new Borrow(borrowid, book, borrower, days);
        borrow.display();


    }
}