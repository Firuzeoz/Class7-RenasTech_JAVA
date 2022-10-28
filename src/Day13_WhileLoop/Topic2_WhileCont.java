package Day13_WhileLoop;

import java.util.Scanner;

public class Topic2_WhileCont {
    //write a code where user is being asked to enter 2 numbers and sum all the numbers
    //in between those two numbers which can be dividd in

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter the first number : ");
        int num1= scan.nextInt();
        System.out.println("Please enter the second number : ");
        int num2= scan.nextInt();

        int i; // cunku hangisinin buyuk yada kucuk oldugunu bilmiyoruz, ayarlamasi gerekli
        int j;

        if(num1>num2){
            i=num2;
            j=num1;
        }else{
            i=num1;  //this will be the start point
            j=num2;  //this will be the end point
        }

        int sum=0; // sum has to start in somewhere right? so toplami 0dan baslattik,next iteration will add 0+new sum,it' wi'll go like this
        while(i<j){

            if(i%5==0) {

                sum += i; // sum=0+13 ==> sum=13+14==> ...
            }
            i++;  // i++ if icine we might use the number between
         }

        System.out.println("The value of sum = " + sum);






    }
}
