//imports
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.io.*;
import java.lang.Exception;
import java.util.Scanner;

@SuppressWarnings("ALL")
class P1Driver {

    //VARIABLE INITIALIZATION

    //array/arraylist
    public static Employee[] Employees2015;
    public static Employee[] Employees2016;

    //counter variables
    private static int Employees2015counter = 0;
    private static int Employees2016counter = 0;
    private static int Get2015AVGSALARAY;
    private static int Get2016AVGSALARY;

    //scanner
    public static Scanner scnr;


    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) throws FileNotFoundException {

        JOptionPane.showMessageDialog( null,"LAUNCHING SALARY CALCULATOR.............." );

        //VARIABLE INITIALIZATION
        Employees2015 = new Employee[200];
        Employees2016 = new Employee[200];


        //File name declare
        File FILENAME;
        FILENAME = new File( "inputData.txt" );

        //input array storage index
        String[] INPUTSTORAGE;
        String year = " ";
        String type = " ";
        String name = " ";
        int monthlySalary;
        int SoldItems;
        int STOCK;
        int ZERO = 0;


        //try/catch bulletproofing
        try {
            scnr = new Scanner( FILENAME );

        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "FILE NOT FOUND", null, JOptionPane.ERROR_MESSAGE );
        }
        //reading from file, storing into array

        while (scnr.hasNextLine()) {
            String LINE = scnr.nextLine();
            INPUTSTORAGE = LINE.split( " " );
            //Employee object
            Employee EMPLOY;

            //Storing in an array
            year = INPUTSTORAGE[0].toString();
            type = INPUTSTORAGE[1].toString();
            name = INPUTSTORAGE[2].toString();
            monthlySalary = Integer.parseInt( INPUTSTORAGE[3] );

            //sorting by type and assigning 5th index (4th subscript) AND CREATING EMPLOYEE OBJECT
            if (type.equalsIgnoreCase( "salesman" )) {
                SoldItems = Integer.parseInt( INPUTSTORAGE[4] );
                EMPLOY = new Salesman( name, monthlySalary, SoldItems );
            }

            //else if statement for Executive
            else if (type.equalsIgnoreCase( "executive" )) {
                STOCK = Integer.parseInt( INPUTSTORAGE[4] );
                EMPLOY = new Executive( name, monthlySalary, STOCK );
            }

            //else for anything besides the two types
            else {
                EMPLOY = new Employee( name, monthlySalary );
            }


            //SORTING BY YEAR AND CORRESPONDING ARRAY
            if (year.equals( "2015" )) {
                Employees2015[Employees2015counter] = EMPLOY;
                Employees2015counter++;
            }

            //else if for 2016
            else if (year.equals( "2016" )) {
                Employees2016[Employees2016counter] = EMPLOY;
                Employees2016counter++;

            }

        }
        //close reader
        scnr.close();

        //calc average annuals
        Get2015AVGSALARAY = getAverage2015Salary();
        Get2016AVGSALARY = getAverage2016Salary();

        //display employeee info
        displayEmployees();

    }







    private static void displayEmployees() {
        System.out.println( "Year 2015" );
        System.out.println( "****************************************************" );

        for (int i = 0; i < Employees2015counter; i++) {
            System.out.println( Employees2015[i] );
            System.out.println( "Annual Salary: " + Employees2015[i].annualSalary() + "\n" );
        }

        System.out.println( "Average Salary: " + getAverage2015Salary() + "\n" );
        System.out.println( "-----------------------------------------" );

        System.out.println( "\nYear 2016" );
        System.out.println( "*********************************************************" );

        for (int i = 0; i < Employees2016counter; i++) {
            System.out.println( Employees2016[i] );
            System.out.println( "Annual Salary for the year: " + Employees2016[i].annualSalary() + "\n" );
            System.out.println( "----------------------------------------" );
        }

        System.out.println( "Average Salary for the year: " + getAverage2016Salary() + "\n" );
        System.out.println( "-------------------------------------------" );

    }

    private static int getAverage2016Salary() {
        int totalSalary = 0;
        int averageSlaary;

        // calculate total salary
        for (int i = 0; i < Employees2016counter; i++) {
            totalSalary += Employees2016[i].annualSalary();
        }

        // calculate average salary
        averageSlaary = totalSalary / Employees2016counter;

        return averageSlaary;
    }

    private static int getAverage2015Salary() {
        int totalSalary = 0;
        int averageSlaary;

        // calculate total salary
        for (int i = 0; i < Employees2015counter; i++) {
            totalSalary += Employees2015[i].annualSalary();
        }

        // calculate average salary
        averageSlaary = totalSalary / Employees2015counter;

        return averageSlaary;
    }
}


