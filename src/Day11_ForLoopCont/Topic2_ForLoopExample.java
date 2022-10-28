package Day11_ForLoopCont;

import java.util.Scanner;

public class Topic2_ForLoopExample {
    //write a code where it counts all the even numbers between 2 numbers those have been entered by user.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first number: "); // assuming the first number is smaller
        int number1=scan.nextInt();
        System.out.println("Please enter the second number: ");
        int number2=scan.nextInt();
        int cnt=0;
        int cnt1=0;
        for (int j = number1 ; j<number2 ; j++) {
            if(j%2 == 0){
                cnt++;
            }else { cnt1++;
            }

        }
        System.out.println("The total count of Even numbers between " +number1+" and " +number2+" is "+cnt);
        System.out.println("The total count of Odds numbers between " +number1+" and " +number2+" is "+cnt1);
    }
}
