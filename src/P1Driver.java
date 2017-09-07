/**
 * Program: Salary Calc
 * Package: Default
 * Class: P1Driver
 * PSVM Method
 * Author: Swapnil Patel
 * Date: 9/6/2017
 */
import java.util.*;
import javax.swing.*;
import java.io.*;
public class P1Driver {


    //variable initialization
    String TEMP = " ";
    private static final String FILENAME = "inputData.txt";
    private static ArrayList <Employee> Employees2015;
    private static ArrayList <Employee> Employees2016;
    private static String[] LINEREAD;

    public static void main(String[] args) throws IOException {

        Employees2015 = new ArrayList<Employee>();
        Employees2016 = new ArrayList<Employee>();
        LINEREAD = new String[500];
        int i = 0;
        BufferedReader bufferedReader = new BufferedReader( new FileReader(FILENAME ) );

        String LINE = bufferedReader.readLine();
        

        bufferedReader.close();


        System.out.println(LINE);

 



    }


}
