public class Static {
    private int notStatic;
    private int Static;


    public void increase(){
        this.notStatic +=1;
        Static +=1;
    }

    public void print(){
        System.out.println(this.notStatic);
        System.out.println(this.Static);
    }
    
}
