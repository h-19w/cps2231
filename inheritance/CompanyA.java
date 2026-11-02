package inheritance;

public class CompanyA {
    public static void main(String[]args){
        manager m1 = new manager("joses", 12000,"hi", "HR manager", 0.005, 50);
        System.out.println("the salary+bonus of the manager is: " + calc_bonus(m1.salary, m1.bonus));
    }

    public static double calc_bonus(double salary, double bonus){
        double tot_salary = salary * (bonus+1);
        return tot_salary;
    }
    public static String performance_reports(double bonus){
        String pr;
        if(bonus >= 5000){
            pr = "excellent";
        }
        if(bonus >= 1000){
            pr = "good";
        }
        else{
            pr = "bad";
        }
        return pr;
    }
    public static void projects(){

    }
}



