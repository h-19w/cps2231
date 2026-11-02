package ch6;
//lab
class ContString {
    public static void main(String[]args){
//        String summer = new String("summer");
//        String summer2 = "summer";
//        System.out.println("summer");
//        System.out.println("autumn");
//        System.out.println("autumn" == "summer");
//        String autumn = new String("summer");
//
//        String name = new String("Paul");
//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(2));
//
//        String letters = "ABcAB";
//        System.out.println(letters.indexOf('B'));
//        System.out.println(letters.indexOf('c'));
//        System.out.println(letters.indexOf("AB", 1));
//
//        System.out.println(letters.indexOf('B', 1));


        String var1 = new String("Java");
        String var2 = new String("Java");
        System.out.println(var1.equals(var2));
        System.out.println(var1==var2);
        System.out.println(var1!=var2);

//        STRINGBUILDER
        StringBuilder sb1 = new StringBuilder("123");
        char[] name = {'J', 'a', 'v', 'a'};
        sb1.insert (1, name, 1, 3) ;
        System.out.println (sb1);

        StringBuilder sb2 = new StringBuilder ("0123456");
        System.out.println (sb2.subSequence (2, 4)); //subsequence()
        System.out.println(sb2);
    }
}
