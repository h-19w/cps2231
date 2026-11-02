package ch8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ch8 { //final exam revision
    public static void main(String[]args) {
        //qn 12
        StringBuilder teams = new StringBuilder("333");
        teams.append(" 806");
        teams.append(" 1601");
        System.out.println(teams);

        //qn 13
        ArrayList<String> tools = new ArrayList<>();
        tools.add("hammer");
        tools.add("nail");
        tools.add("hex key");
        System.out.println(tools.get(1));

        //qn 14
        ArrayList<String> museums = new ArrayList<>(1);
        museums.add("natural history");
        museums.add("science");
        museums.add("art ");
        museums.remove(2);
        System.out.println(museums);

        //qn 15
        StringBuilder line = new StringBuilder("-");
        StringBuilder anotherLine = line.append("-"); //line^ now becomes "--"
        System.out.print(line == anotherLine); // true because class StringBuilder is mutable and refers to the same object
        System.out.print(" ");
        System.out.print(line.length());

        //qn 16
//        Predicate<StringBuilder> p = (StringBuilder) -> {return true;};
        //remove what so that the code can compile...
//        Predicate<StringBuilder> p = {return true;❌
//        Predicate<StringBuilder> p = (StringBuilder)  {return true;};❌
//        Predicate<StringBuilder> p = (StringBuilder) -> return true;❌
        Predicate<StringBuilder> p = (StringBuilder) -> true;

        //qn 17
        String b = "12";
        b += "3";
//        b.reverse();  ---- no such String Class method.
        System.out.println(b.toString());

    }
}
