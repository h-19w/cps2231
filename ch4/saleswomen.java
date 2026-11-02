package ch4;

import java.util.Scanner;

public class saleswomen {
    double sale = 0;
    double commission = 0;
    String remarks = "";

    public saleswomen(double s, double c, String r) {
        sale = s;
        commission = c;
        remarks = r;
    }

    public static double sales(){
        System.out.println("Enter sales done by the saleswoman for each week in a month:");
        int[] weeklySales = new int[4]; // Assuming there are 4 weeks in a month
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < weeklySales.length; i++) {
            System.out.print("Week " + (i + 1) + ": ");
            weeklySales[i] = input.nextInt();
        }
        int totalSales = 0;

        for (int sale : weeklySales) {
            totalSales += sale;
        }
        return totalSales;
    }
    public static double commission(double s){
            double c = 0.0;
            if (s >= 10000) {
                c =  s * 0.05;
                return c; // 5% c for sales >= 10000
            } else {
                c = 0;
                return c;
            }
        }
    public static String remarks(double s){
        String r;
        if(s>=80000){
            r = "Excellent!!";
        }
        if(s>=60000){
           r ="Good!";
        }
        if(s>=40000){
            r = "Average.";
        }
        else{
           r = "Work Hard...";
        }
        return r;
    }

    public String toString() {
        return "Total monthly sales: $$" + sale + ", Commission: $$" + commission + ", Remarks: "
                + remarks;
    }

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of ch4.saleswomen: ");
        int num = input.nextInt();

        if(num == 0) {
            System.out.println("Enter the number of ch4.saleswomen: ");
            num = input.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            System.out.println("- Saleswoman " + i + " -");
            System.out.print("Enter sales: ");
            double s = sales();
            double c = commission(s);
            String r = remarks(s);
            saleswomen sw = new saleswomen(s, c, r);
            System.out.println(sw);
            System.out.println("-------------");
        }
    }
}

