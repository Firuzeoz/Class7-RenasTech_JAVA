package Day13_WhileLoop;

import java.util.Scanner;

public class Topic1_WhileLoop {
    public static void main(String[] args) {

        //write a code where user is being asked to enter 2 numbers and
        //find how many even numbers are in between those 2 numbers

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1=scan.nextInt();
        System.out.println("Please enter the second number: ");
        int num2=scan.nextInt();

        int count=0;
        int i=num1; // if we want to still keep our original num1 value, we are storing it in a new variable
        // so we can play around with the original num1 value
        while(i<num2){ //this will be true

            if(i%2==0){
                count++;
            }
            i++; // if we do not increase the num1 this loop will infinite
            System.out.println("The first number for each iteration is: "+i);
        }
        System.out.println("The count of even numbers is : "+count+ " also i value is:" +i+ " and num1 is "+num1+" , num2 is :"+num2) ;


    }
}
