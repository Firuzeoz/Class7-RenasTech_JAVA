package Day11_ForLoopCont;

import java.util.Scanner;

public class Topic1_ForLoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the first integer number: ");
        int num1=sc.nextInt();
        System.out.println("Please enter the second integer number: ");
        int num2=sc.nextInt();
        int count=0;
        for (int i = num1; i<=num2 ; i++) {//i++  i=i+1;
            //int count=0 ; this will be the count to be zero everytime code get executed
            if(i%3==0){
                count++; // count=count+1;

            }
            System.out.println("The count of all the numbers that can be divided by 3 is = " + count);
        }
       // System.out.println("The count of all the numbers that can be divided by 3 is = " + count);



    }
}


