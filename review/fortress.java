package review;

public class fortress {
    public void openDrawbridge()throws Exception{
        try{
            throw new Exception("circle");
        }catch(Exception e){
            System.out.println("opening");
        } finally {
            System.out.println("walls");
        }
    }
    public static void main(String[]moat){
//        new fortress().openDrawbridge();;
    }
}
