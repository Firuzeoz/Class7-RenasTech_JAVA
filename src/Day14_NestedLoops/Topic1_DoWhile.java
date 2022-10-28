package Day14_NestedLoops;

import java.util.Scanner;

public class Topic1_DoWhile {
    //do{
    // Code Block
    // }while(condition)
//we do code block then we check the conditions-means code will be executed at least 1 time
    public static void main(String[] args) {

//print all the numbers from 1 to 10

        int i=1;
        do{
            System.out.println("The number is : " +i);
            i++;

        }while(i<1);  //even the condition is false it's will execute at least 1 time.
        System.out.println("****************************");


        //write a code where user is being asked to enter a one letter string
        //but even the string has more than 1 char
        //print only the first char

        System.out.println("Please enter a one letter string: ");
        Scanner scan=new Scanner(System.in);
        String letter=scan.nextLine();
        int j=0;
        do{

            System.out.println("The first char of the String is: "+letter.charAt(j));
            j++;
        }while(j<3);





    }
}
