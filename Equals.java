public boolean equals(Object c){
    if (c instanceof Person == false){
        return false;
    }
    Person p = (Person) c;
    return this.name.equals(p.name) && this.age == p.age;
}
public class Equals {
    public static void main(String[] args){
        Person p1 = new Person("John", 21);
        Person p2 = new Person("John", 21);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
    }
}
    

