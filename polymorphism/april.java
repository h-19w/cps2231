package polymorphism;

import java.awt.*;

public class april {
    class Shape{
        private static String colour;
        public Shape(){

        }
        public double getArea(){
            double a = 0.0;
            return a;
        }
        public void display(){

        }
    }
    class Rectangle extends Shape{
        private int length, width;
        public Rectangle(String c, int l, int w){
            c = super.colour;
            this.length = l;
            this.width = w;
        }
        @Override
        public double getArea() {
            double a = length * width;
            return super.getArea();
        }
    }
    class Triangle extends Shape{
        private int base, height;
        public Triangle(String c, int b, int h){
            c = super.colour;
            this.base = b;
            this.height = h;
        }
        @Override
        public double getArea(){
            double a = (1/2) * base * height;
            return super.getArea();
        }
    }

    public void main(String[]args){
        Shape r1 = new Rectangle("hi",3, 1); // the parent can be used as the type called because of thr upcasting relationship between both classes
        Shape t1 = new Triangle("bruh", 4, 8);

    }
}
