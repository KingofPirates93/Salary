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

    /**
     * It returns the salary for a whole year
     */
    public int annualSalary() {
        return monSalary * 12;
    }

    /**
     * returns a string containing the name and monthly salary
     */
    public String toString() {
        String toReturn;
        toReturn = "Name: " + Ename + "\n";
        toReturn += "Monthly Salary: $" + monSalary + "\n";
        return toReturn;
    }
}

