package ch4;

public class building {
    public static void main(String[]args){
        double height, weight, breadth;
        height = 0;
        weight = 0;
        breadth = 0;
        volume(height, weight, breadth);
    }
    public static building volume(double h, double w, double b){
        double vol = h * b * w;
        System.out.println("the volume is: "+vol);
        return null;
    }

}
