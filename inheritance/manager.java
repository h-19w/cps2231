package inheritance;

class manager extends employee {
    int subs = 0;
    public manager(String name, double salary, String address, String jobtitle, double bonus, int subs) {
        super(name, salary, address, jobtitle, bonus);
        this.bonus = 0.005;
    }
}