package ch3;

import java.util.Scanner;
public class practice1_3 {
    public static void main(String[]args){
        double b,h;
        Scanner input =  new Scanner(System.in);
        System.out.println("enter the length of the base of the triangle: ");
        b = input.nextDouble();
        System.out.println("enter the height of the triangle: ");
        h = input.nextDouble();

        System.out.println("the area of the triangle is : ");
        System.out.println((b * h) / 2);
    }
}
