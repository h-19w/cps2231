package revision_midterm;
//Three private instances variable arrays named a, b, c, and d that specify the four point of
//a rectangle. (Note: a, b, c, and d, are one dimensional arrays of type double).
// Eight private instances variable of type double x1, y1, x2, y2, x3, y3, x4, y4, where (x1,
//y1), (x2, y2), (x3, y3), (x4, y4) represent the coordinates of a, b, c, and d, respectively.
// The getter and setter methods for the variables a, b, c, and d.
//(Note: You can consider a[0]=x1; a[1]=y1; b[0]=x2; b[1]=y2; c[0]=x3; c[1]=y3, and d[0]=x4;
//d[1]=y4).
// A default constructor to initialize the value of the coordinates.
// An instance method getPerimeter that returns the perimeter of the rectangle.

// An instance method getArea that returns the area of the rectangle.
// A method check form that returns true if point a, b, c, and d form a square, and returns
//false otherwise.
//Note:
//The length of the side AB can be calculated as follows:
//Math.sqrt((Math.pow((a[0]-b[0]), 2))+(Math.pow((a[1]-b[1]), 2)));

public class MyRectangle {
    private double[] a = new double[2];
    private double[] b = new double[2];
    private double[] c = new double[2];
    private double[] d = new double[2];
    private double x1, y1, x2, y2, x3, y3, x4, y4;

    // Default constructor
    public MyRectangle() {
        x1 = a[0];
        x2 = b[0];
        x3 = c[0];
        x4 = d[0];
        y1 = a[1];
        y2 = b[1];
        y3 = c[1];
        y4 = d[1];
    }

    // Getter and setter
    public double[] getA() {
        return a;
    }
    public void setA(double x1, double y1) {
        this.a[0] = x1;
        this.a[1] = y1;
    }
    public double[] getB() {
        return b;
    }
    public void setB(double x2, double y2) {
        this.b[0] = x2;
        this.b[1] = y2;
    }
    public double[] getC() {
        return c;
    }
    public void setC(double x3, double y3) {
        this.c[0] = x3;
        this.c[1] = y3;
    }
    public double[] getD() {
        return d;
    }
    public void setD(double x4, double y4) {
        this.d[0] = x4;
        this.d[1] = y4;
    }

    // main
    public static void main(String[]args){
        MyRectangle quad = new MyRectangle();
        System.out.println("the Perimeter of the quadrilateral is: " + getPerimeter(quad.a,quad.b,quad.c,quad.d));
        System.out.println("the Area of the quadrilateral is: " + getArea(quad.a,quad.b,quad.c));
        if(checkForm(quad.a,quad.b,quad.c,quad.d)){ //if true
            System.out.println("the quadrilateral is a square.");
        }
        else{ //cf = false
            System.out.println("the quadrilateral is NOT a square.");
        }
    }

    public static double getPerimeter(double[] a, double[] b, double[] c, double[] d){
        double AB =  Math.sqrt((Math.pow((a[0]-b[0]), 2)+Math.pow((a[1]-b[1]), 2)));
        double BC =  Math.sqrt((Math.pow((b[0]-c[0]), 2)+Math.pow((b[1]-c[1]), 2)));
        double CD =  Math.sqrt((Math.pow((c[0]-d[0]), 2)+Math.pow((c[1]-d[1]), 2)));
        double AD =  Math.sqrt((Math.pow((a[0]-d[0]), 2)+Math.pow((a[1]-d[1]), 2)));

        return (AB + BC + CD + AD);
    }
    public static double getArea(double[] a, double[] b, double[] c){
        double AB_b = Math.sqrt((Math.pow((a[0]-b[0]), 2)+Math.pow((a[1]-b[1]), 2)));
        double BC_h = Math.sqrt((Math.pow((b[0]-c[0]), 2)+Math.pow((b[1]-c[1]), 2)));

        return (AB_b)*(BC_h);
    }
    public static boolean checkForm(double[] a, double[] b, double[] c, double[] d){
//        returns true if  point a, b, c, and d form a square, and returns false otherwise.

        double AB =  Math.sqrt((Math.pow((a[0]-b[0]), 2)+Math.pow((a[1]-b[1]), 2)));
        double BC =  Math.sqrt((Math.pow((b[0]-c[0]), 2)+Math.pow((b[1]-c[1]), 2)));
        double CD =  Math.sqrt((Math.pow((c[0]-d[0]), 2)+Math.pow((c[1]-d[1]), 2)));
        double AD =  Math.sqrt((Math.pow((a[0]-d[0]), 2)+Math.pow((a[1]-d[1]), 2)));

        boolean b1 = false;

        if (AD == BC && BC == CD && CD == AD && AD == AB){
            b1 = true;
        }
        return b1;
    }
}
