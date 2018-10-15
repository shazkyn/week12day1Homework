package Staff;

public abstract class Employee {

    private String name;
    private String natInsNum;
    private double salary;

    public Employee(String name, String natInsNum, int salary ) {
        this.name = name;
        this.natInsNum = natInsNum;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getNatInsNum() {
        return natInsNum;
    }

    public void setNatInsNum(String natInsNum) {
        this.natInsNum = natInsNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise){
        this.salary += raise;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }


}


