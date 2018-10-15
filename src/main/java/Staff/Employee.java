package Staff;

public abstract class Employee {

    private String name;
    private String natInsNum;
    private double salary;

    public Employee(String name, String natInsNum, double salary ) {
        this.name = name;
        this.natInsNum = natInsNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNatInsNum() {
        return natInsNum;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        if (raise > 0) {
            this.salary += raise;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}


