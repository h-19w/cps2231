package review;

public class chooseWisely {

    public chooseWisely() {
        super();
    }
    public int choose(int choice) {
        return 5;
    }
    public int choose(short choice) {
        return 2;
    }
    public int choose(long choice) {
        return 11;
    }
    public static void main(String[]path){
        System.out.println(new chooseWisely().choose((byte)2+1));
    }
}
