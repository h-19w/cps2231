package GeometricObj;

public class circle extends Geometric_obj {
    private double radius;
    public circle(){
    }
    public circle(double r){
        this.radius = r;
    }
    public circle(double r, String c, boolean f){
        this.radius = r;
        setcolour(c);
        isfilled(f);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public double getDiameter(){
        return (radius * 2);
    }
    public double getArea(){
        return (radius * radius * Math.PI);
    }
    public double getPerimeter(){
        return (radius * 2 * Math.PI);
    }

}
