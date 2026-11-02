package ch10;

public class nullpointerexception {
    static int[][] game;
    public static void main(String[]args){
        game[3][3] = 6;
        Object[] obj = game;
//        game[3][3] = "X"; //null pointer exception - incompatible types
        System.out.println(game[3][3]);
    }
}
