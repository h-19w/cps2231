package ch10;

public class runtimeexception {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
        } catch (Exception e) {
            System.out.print(e);
        }
        System.out.println(" rest of the code");
    //handling the exception catch (ArithmeticException e)System.out. printin (Exception e) ;
}
}
