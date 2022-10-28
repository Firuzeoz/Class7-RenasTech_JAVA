package Day8_Scanner;

import java.util.Scanner;

public class Topic1_Scanner {
    // Next() == > It will read a word from the console-until space ,
           // for exp for the below example iut will read only "Java "
           //Java Class
    //NextLine() ==> It reads the whole line on the console.
          //for the above exp it will read " Java Class "
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name : ");
        String firstName = scan.next();
        System.out.println("your firstname is: " +firstName);
        System.out.println("Please enter your age:  ");
        String age=scan.next(); // we used string instead int ,cause strings are characters ,
        // i have to convert this number and do the operations
        System.out.println("Your age is : " + age);
        System.out.println("Please enter your Zip Code : ");
        String zipCode=scan.next();
        String zipCodeAge=age+zipCode;
        System.out.println("The Age + Zip Code is : " + zipCodeAge);




    }
}
