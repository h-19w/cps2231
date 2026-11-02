package ch8;

public class revQn18 {
    interface Target{
        boolean NeedToAim(double angle);
    }
    static void prepare(double angle, Target t){
        boolean ready = t.NeedToAim(angle);
        System.out.println(ready);
    }
    public static void main(String[]args){
        prepare(45, d -> d > 5 || d < -5);
    }                  // ^ determines the true/false

}
