package ch9;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[]args){
        ArrayList<String> a = new ArrayList<>();
        a.add("one");
        a.add("two");
        a.add("four");
        a.add(2, "three");

        for(String element : a){
            System.out.println(element);
        }
    }
}

