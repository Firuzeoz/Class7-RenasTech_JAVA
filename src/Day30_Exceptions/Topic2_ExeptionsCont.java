package Day30_Exceptions;

import java.util.Scanner;

public class Topic2_ExeptionsCont {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int ValueA=scan.nextInt();

        System.out.println("Please enter another number: ");
        int ValueB=scan.nextInt();


        double ValueC=0;
        try{

       ValueC=ValueA / ValueB;

       }catch (Exception e){

       System.out.println("Can't divided by Zero!");

       }
        System.out.println("The Result = " +ValueC);
        System.out.println("Rest of Code");
    }
}
