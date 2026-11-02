package ch11;

public class Factorial {
    public static void main(String[]args){
        System.out.println(factorial(3));
        String[] str =  new String[2];
        System.out.println(str);


    }
    public static long factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n - 1); //recursive call
        }
    }
}
