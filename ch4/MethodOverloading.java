package ch4;

public class MethodOverloading {
    void sum(int a, double b){
        System.out.println("a+b =" +(a+b));
    }
    void sum(double a, int b, int c){
        System.out.println("a+b =" +(a+b+c));
    }
    public static void main(String[]args){
        MethodOverloading obj = new MethodOverloading();
        obj.sum(20, 20.5);
        obj.sum(20, 20, 21);
    }
}
