package ch7;

abstract class Book {
protected static String material = "papyrus";
public Book () {}
public Book(String material) {this.material = material;}
        }
public class Encyclopedia extends Book {
    public static String material = "cellulose"; //new 'material' obj
    public Encyclopedia () {super () ;} // calls the superclass (Book(and its 'material'))
    public String getMaterial() {return super.material;}
    // ^^calls the first 'material' in the class Encyclopedia which is the one from its superclass {"papyrus"}
     public static void main (String[] pages) {
        System.out.print(new Encyclopedia().getMaterial());
    }
}