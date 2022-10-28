package Day8_Scanner;

import java.util.Scanner;

public class Topic2_nextVSnextline {
    // Next() == > It will read a word from the console-until space ,
    // for exp for the below example iut will read only "Java "
    //Java Class
    //NextLine() ==> It reads the whole line on the console.
    //for the above exp it will read " Java Class "
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" Please enter your fist name and last name: ");
        String name=sc.nextLine();
        System.out.println("your first and last name is: " +name);


        System.out.println("Please enter your phone number: ");
        String phone=sc.nextLine();
        System.out.println(" Your name is: "+ name+" , and your phone number is: "+phone);


    }
}
