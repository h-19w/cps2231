package GeometricObj;

import java.util.Date;
abstract class Geometric_obj {
    private String colour;
    private boolean filled;
    private java.util.Date date;
    protected Geometric_obj(){
        date = new java.util.Date();
        colour = "white";
        filled = false;
    }
    protected Geometric_obj(String c, boolean f){
        this.colour = c;
        this.filled = f;
        date = new java.util.Date();
    }
    public String getcolour(){
        return colour;
    }
    public void setcolour(String c){
        this.colour = c;
    }
    public boolean getfilled(){
        return filled;
    }
    public void isfilled(boolean f){
        this.filled = f;
    }
    public java.util.Date getDateCreated(){
      return getDateCreated();
    }
    @Override
    public String toString() {
        return "created on " + date  + "\ncolor: " + colour + " and filled: " + filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

}
