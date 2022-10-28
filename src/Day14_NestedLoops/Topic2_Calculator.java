package Day14_NestedLoops;

import java.util.Scanner;

public class Topic2_Calculator {
    /*Write a calculator program where it will do following
     1-user will be asked to make the decision 1 for Sum,2 for Sub, 3 for Div,4 for Mult, any other numbers to exit
     2-After user make the selection user should be asked to enter first number
     3-After user should be asked to the enter second number
     4-Perform the calculation and print the result
     5-Perform the calculation for different entries unless user select to exit
    */
    public static void main(String[] args) {
        System.out.println("*****Welcome the Calculator!*****");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please make the selection :\n 1 for SUM ,\n 2 for SUB,\n 3 for DIV,\n 4 for MULT,\n Any others for EXIT : ");
        int selection=scan.nextInt();
        while(selection==1 || selection==2 || selection==3 || selection==4){
            System.out.println("Please enter the first number : ");
            double first= scan.nextDouble();
            System.out.println("Please enter the second number : ");
            double second= scan.nextDouble();
            double result=0; //you can assign anything,because it will change tho
            if(selection==1){
                result=first+second;
            }else if(selection==2){
                result=first-second;

            }else if(selection==3){
                result=first/second;
            }else{
                result=first*second;

            }
            System.out.println("The result of the operation is : "+result);
            System.out.println("Please make the selection :\n 1 for SUM ,\n 2 for SUB,\n 3 for DIV,\n 4 for MULT,\n Any others for EXIT : ");
            selection=scan.nextInt();

        }
        System.out.println(" Thank you for using Calculator! \n ---> You are exited now. <---");

    }
}
