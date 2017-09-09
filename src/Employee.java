/**
 * Program: Salary Calculator
 * Package: Default
 * Class: Employee
 * Author: Swapnil Patel
 * Date: 9/6/2017
 */
public class Employee {
    String Ename;
    int monSalary;

  //CONSTRUCTOR
    public Employee(String name, int salary) {
        this.Ename = name;
        this.monSalary = salary;
    }

    //annual salary
    public int annualSalary() {
        return monSalary * 12;
    }

   //to string
    @Override
    public String toString() {
        String toReturn;
        toReturn = "Name: " + Ename + "\n";
        toReturn += "Monthly Salary: $" + monSalary + "\n";
        return toReturn;
    }
}

