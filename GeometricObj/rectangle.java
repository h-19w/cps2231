package GeometricObj;

public class rectangle extends Geometric_obj {
    private double width;
    private double height;
    public rectangle(){
    }
    public rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }
    public rectangle(double w, double h, String c, boolean f){
        this.width = w;
        this.height = h;
        setcolour(c);
        isfilled(f);
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double w){
        this.width = w;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        this.height = h;
    }
    public double getArea(){
        return (width * height);
    }
    public double getPerimeter(){
        return (width + height + width + height);
    }

}
