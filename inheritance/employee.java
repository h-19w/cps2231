package inheritance;

class employee{
    String name;
    double salary;
    String address;
    String jobtitle;
    double bonus;
    public employee(String name, double salary, String address, String jobtitle, double bonus){
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.jobtitle = jobtitle;
        this.bonus = bonus;
    }
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
    public String getAddress(){
        return address;
    }
    public void setAddress(String phonenumber){
        this.address = address;
    }
    public String getjobtitle(){
        return jobtitle;
    }
    public void setJobtitle(String jobtitle){
        this.jobtitle = jobtitle;
    }
}