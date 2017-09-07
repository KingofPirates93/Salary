/**
 * Program: Salary Calc
 * Package: Default
 * Class: Salesman
 * Superclass: Employee
 * Author: Swapnil Patel
 * Date: 9/6/2017
 */
public class Salesman extends Employee {
    //global var
    int soldItems;

    //constructor
    public Salesman(String NAME, int MONSALARY, int SoldItems) {
        super( NAME, MONSALARY );
        this.soldItems = SoldItems;
    }

    //Yearly salary
    public int annSalesmanSalary(){
        int COMMISSION = 0;
        int BONUSRATE = 2;
        int BASEPAY = super.annualSalary();

        if (soldItems >= 300)
        {
            COMMISSION = BONUSRATE * getMonthlySalary();
        }
        else if (soldItems > 200 && soldItems < 300 )
        {
            COMMISSION += getMonthlySalary();
        }

        else if (soldItems < 200)
        {
            COMMISSION = 0;
        }

        return BASEPAY + COMMISSION;

    }

    @Override
    public String toString(){
        return super.toString() + "Number of items sold: " + soldItems + "\n";
    }

}
