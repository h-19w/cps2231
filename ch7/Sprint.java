package ch7;

interface Run {
    default void walk(){
    System.out.print("walking and running!");
    }
}
interface Jog {
//    Override ⬇︎ the 2 conflicting default walk()s
    default void walk () {
        System.out.print ("Walking and jogging!");
    }
}
public class Sprint implements Run, Jog {
    public void walk() {
        System.out.print("Sprinting!");
    }
    public static void main() {
        new Sprint().walk();
    }
}