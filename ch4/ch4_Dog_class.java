package ch4;

public class ch4_Dog_class {
    String breed;
    String size;
    int age;
    String colour;
    public String get_info(){
        return("Breed is: "+breed+"; Size is: "+size+"; Age is: "+age+ "; Colour is: "+colour);
    }
    public static void main(String []args){
        ch4_Dog_class maltese = new ch4_Dog_class();
        maltese.breed = "maltese";
        maltese.size = "small";
        maltese.age = 2;
        maltese.colour ="brown";
        System.out.println(maltese.get_info());
    }
}
