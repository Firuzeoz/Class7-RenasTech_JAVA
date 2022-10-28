package Day7_SwichStatements;

import java.io.File;
import java.util.Scanner;

public class Topic5_Scanner {

    public static void main(String[] args) {
        //Scanner is a class in Java Lab
        //Scanner has multiple methods that can be used
        //In order to have a scanner you need to create an object form that class
        //In order to use Scanner we need to import the Class to our class.write Sc and double click it will come from java.util

        Scanner scan =new Scanner(System.in);

        /*In above, I said to IJ :
        create a new Scanner type object and scan is the object now -
        and where this object will get information from the system in input
        scan object will get input info from the console or from the system
         */
        //Scanner scan2=new Scanner(File.createTempFile())
        // u can put anything in new Scanner(here),
        // basically you are pointing to the source where you are going to get the data!

        System.out.println("Hey user! Enter a number : " );

        //in order to assign scanner value to a variable first i need to define the data type of variable.
        int number = scan.nextInt(); // int number=12;
//go to the console(which scan will get the information from the console),grab the next int value and assign to the number!

        System.out.println("The value of the variable number is: "+ number);


        System.out.println("Hey user enter a double type variable: ");
        double dnumber=scan.nextDouble();
        System.out.println("The double number is : " +dnumber);




        System.out.println("Hey user enter a byte type variable: ");
        byte bnumber=scan.nextByte();
        System.out.println("The byte number is : " +bnumber);


        System.out.println("Hey user enter a float type variable: ");
        float fnumber=scan.nextFloat();
        System.out.println("The float  number is : " +fnumber);

        short snumber=scan.nextShort();//this will wait for the for user to enter a short number -on console- assign it to a variable
        long lnumber=scan.nextLong();//this will wait for the for user to enter a long number -on console- assign it to a variable



    }
}
