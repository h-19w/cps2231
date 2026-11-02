package BSMS;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner((System.in));
        int res;
        menu();
        do {
            res = input.nextInt();
            switch (res){
                case 0:System.out.println("Invalid option");
                    menu();
                    break;
                case 1: ;
                    menu(); break;
                case 2: ;
                    menu(); break;
                case 3: ;
                    menu(); break;
                case 4:;
                    menu(); break;
                case 5: ;
                    menu(); break;
                case 6:
                    menu(); break;
                case  7:
                    break;
                default: System.out.println("invalid option\nChoose again: "); res = 7; break;
            }
        } while (res != 6);
        input.close();
        System.out.println("Terminating...");

    }
    public static void menu(){
        System.out.println("Main Menu: \n" +
                "1. Addition Quiz \n" +
                "2. Guess the first card \n" +
                "3. Calculate BMI \n" +
                "4. Investment calculator \n" +
                "5. Print Calendar \n" +
                "6. Exit \n" +
                "Enter your option:");
    }
}
