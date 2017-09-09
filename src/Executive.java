/**
 * Program: Salary Calc
 * Package: Default
 * Class: Executive
 * Superclass: Employee
 * Author: Swapnil Patel
 * Date: 9/6/2017
 */
public class Executive extends Employee {

    //global var
    private final int STOCK;

    //constructor
    public Executive(String NAME, int MONSALARY, int stockPrice){
        super(NAME, MONSALARY );
        this.STOCK = stockPrice;
    }

    public int annExecSalary(){
        int BONUS = 0;
        int minPrice = 100;
        int BASEPAY = super.annualSalary();

        if (STOCK > minPrice)
        {
            BONUS = 20000;
        }

        return BASEPAY + BONUS;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStock Price: " + STOCK;
    }
}
