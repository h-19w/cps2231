package review;

public class overriding extends complexmath{
    public final double secret = 8;
    public static void main(String[] numbers){
        math m = new overriding();
        System.out.println(m.secret);
    }

}
class math{
    public final double secret = 2;
}
class complexmath extends math{
    public final double secret = 4;
}