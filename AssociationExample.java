import java.util.Arrays;

public class AssociationExample {
    public static void main(String[]args){
        Programmer emp = new Programmer(); //inheritance.programmer inherited the objects of class inheritance.employee.
        emp.setName("hi");
        emp.setSalary(7000);

        Programmer p1 = new Programmer();
        p1.setPhonenum("1453 6780");
        Programmer p2 = new Programmer();
        p2.setPhonenum("+07 8923 8445");
        // make the phone num in inheritance.programmer into a string then call it through inheritance.employee
        String[] programmer = new String[2];
        programmer[0] = p1.getPhonenum();
        programmer[1] = p2.getPhonenum();

        emp.setProgrammer(Arrays.toString(programmer));

        System.out.println("Name: "+emp.name +"\nSalary: "+ emp.salary + "\ninheritance.programmer's phone number(s): "+ emp.programmer);

    }
}
class Employee{
    String name;
    double salary;
    String programmer;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getProgrammer(){
        return programmer;
    }
    public void setProgrammer(String programmer){
        this.programmer = programmer;
    }
}
class Programmer extends Employee{
    String phonenum;

    public String getPhonenum(){
        return phonenum;
    }
    public void setPhonenum(String phonenum){
        this.phonenum = phonenum;
    }
}
