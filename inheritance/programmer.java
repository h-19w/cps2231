package inheritance;

class programmer extends employee{
    public programmer(String name, double salary, String address, String jobtitle, double bonus){
        super(name, salary, address, jobtitle, bonus);
        this.bonus = 0.01;
    }
}
