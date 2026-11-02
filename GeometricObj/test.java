package GeometricObj;

public class test {
    public static void main(String[] args) {
        System.out.print("CIRCLE ");
        Geometric_obj c1 = new circle(4.0, "purple", false);
        System.out.println(c1);
        System.out.println("Area: "+ c1.getArea());
        System.out.println("Perimeter: "+ c1.getPerimeter());

        System.out.println();
        System.out.print("RECTANGLE ");
        Geometric_obj r1 = new rectangle(4, 5, "black", true);
        System.out.println(r1);
        System.out.println("Area: "+ r1.getArea());
        System.out.println("Perimeter: "+ r1.getPerimeter());


}
}
