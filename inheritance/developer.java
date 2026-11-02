package inheritance;

class developer extends employee {
    public developer(String name, double salary, String address, String jobtitle, double bonus) {
        super(name, salary, address, jobtitle, bonus);
        this.bonus = 0.02;
    }
}