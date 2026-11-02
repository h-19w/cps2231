package review;

public class song {
    public void playMusic(){
        System.out.println("play!");
    }
//    private static int playMusic(){
//        System.out.println("music!");
//    }
    public static void main(String[]args){
        new song().playMusic();
    }
}
