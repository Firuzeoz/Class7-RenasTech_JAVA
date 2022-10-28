package Day10_StringMethods;

import java.util.Scanner;

public class Topic3_ForLoops {


        /*

       for(starting point; end point; increase or decrease){

       Code Block

       }

       */
        public static void main(String[] args) {

            for(int i=0; i<20 ; i++){ // at the end increase i value by 1


                System.out.println("The value of i: " +i);

            }

            System.out.println("*************");
           for(int i=10; i<=90 ; i+=2) { // i=i+2 //increase i by 2
                System.out.println("The i value is: " + i);
           }
          System.out.println("****************");
            for (int i = 20; i >0 ; i--) {
                System.out.println("i = " + i);
            }
            for (int i =  10; i >0; --i) {
                System.out.println("i = " + i);
            }
            //System.out.println("i = " + i); this will error out bc i is only accessible inside the loop(local variable)
            System.out.println("***********");
            for (int i = 5; i <=15; i*=3) {
                System.out.println("i = " + i);
            }
            System.out.println("*************");
// write a code where you calculate the sum of all numbers between 0 to 20;
            int result=0;
            for (int j= 0; j <20; j++) {
               result=result+j;   // result=0+0=0;
                                  //  result=0+1=1;
                                 //  result=1+2=3;
                                 //  result=3+3=6;
                                 //  result=6+4=10;
                System.out.println("result = " + result);

            }

        }
}
