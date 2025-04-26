interface Packable{
    double weight();
}
class Book implements Packable{
    private String author;
    private String name;
    private double weight;
    public Book(String author, String name, double weight){
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    public double weight(){
        return this.weight;
    }
    public String toString(){
        return author + ": " + name;
    }
}

class CD implements Packable{
    private String artist;
    private String name;
    private int publicationYear;
    private final double weight = 0.1;
    public CD(String artist, String name, int publicationYear){
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
    }
    public double weight(){
        return this.weight;
    }
    public String toString(){
        return artist + ": " + name + " (" + publicationYear + ")";
    }
}
public class INTERFACE001 {
    public static void main(String[] args){
        Book B = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2.0);
        Book B1 = new Book("Robert Martin", "Clean Code", 1.0);
        Book B2 = new Book("Kent Beck", "Test Driven Development", 0.5);
        CD C = new CD("Pink Floyd", "The Dark Side of the Moon", 1973); 
        CD C1 = new CD("Wigwam", "Nuclear Nightclub", 1795);
        CD C2 = new CD("Rendezvous Park", "Closer to being Here", 2012);
       System.out.println(B);
       System.out.println(B1);
       System.out.println(B2);
       System.out.println(C);
       System.out.println(C1);
       System.out.println(C2);

    }
    
}
