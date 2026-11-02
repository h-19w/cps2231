package ch4;

import ch4.building;

import java.util.Scanner;

public class buildingdemo {
    public static void main(String[]args){
        double h, w, b;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the height; ");
        h = input.nextDouble();
        System.out.println("enter the weight; ");
        w = input.nextDouble();
        System.out.println("enter the breadth; ");
        b = input.nextDouble();

        building.volume(h,w,b);


    }
}
