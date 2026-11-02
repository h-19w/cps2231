package ch3;

import java.util.Scanner;

public class practice1 {
    public static void main(String[]args){
        double x;
        double fx = 0;
        Scanner input =  new Scanner(System.in);
        System.out.println("enter the value of X: ");
        x = input.nextInt();

        fx = (3.14)*(x * x);
        System.out.println(fx);
    }
}
