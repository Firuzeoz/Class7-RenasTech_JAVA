package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic1_ForLoopCont {
    public static void main(String[] args) {
//write a code where it asks user to enter 2 different numbers
//and sum all the even number in between those 2 numbers
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1=scan.nextInt();
        System.out.println("Please enter the second number: ");
        int num2=scan.nextInt();
            int start ;
            int end;
            if(num1>num2){ // now we are looking if the first num is not smaller
                           // we have to be sure that starting point is smaller number
                   start=num2;
                   end=num1;
             }else {      // if both numbers are the same it goes to else statement
                start=num1;
                end=num2;
            }
            //define a sum start it from zero, cause there is no value at the beginning
        int sum=0;
        for (int i = start; i <end ; i++) {
            if(i%2==0){
                sum+=i; // sum=sum+i;
            }
        }// print the statement outside the for loop
        System.out.println("The sum of all the even numbers between " +start+" and "+end+" is: "+sum);







    }
}
