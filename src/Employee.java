/**
 * Program: Salary Calc
 * Package: Default
 * Class: Employee
 * Author: Swapnil Patel
 * Date: 9/6/2017
 */
public class Employee {

    //global var.
    private String eName;
    private int monthlySalary;

    //Accessor and Mutator
    public String geteName() {return eName;}

    public void seteName(String eName) {this.eName = eName;}

    public int getMonthlySalary() {return monthlySalary;}

    public void setMonthlySalary(int monthlySalary) {this.monthlySalary = monthlySalary;}

    //constructor
    public Employee(String NAME, int MONSALARY){

        this.eName = NAME;
        this.monthlySalary = MONSALARY;
    }
    //Annual Salary member method
    public int annualSalary(){return monthlySalary * 12;}

    //toString for name and salary
    @Override
    public String toString() {
        return super.toString() + "Name: " + eName
                + "\n"
                + "Monthly Salary: " + monthlySalary;

    }

}
