package Day17_ArraysCont;

import java.util.Scanner;

public class Topic1_ArraySumElements {
    //write as code with following requirements
    //user should be asked about how many numbers that is going to add to array
    //user should be asked for each element for the array
    //find the sum of all element in array
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number of elements would you like to add to Array : ");
        int size=scan.nextInt();
        double [] numbers=new double [size];// { 0.00,0.00,0.00,0.00, , , }

        for (int i = 0; i <size ; i++) { // i could put i<numbers.length

            System.out.println("Please enter the "+(i+1)+ ". number: ");
            double num=scan.nextDouble();
            numbers[i]=num;

        }
       double sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            sum+= numbers[i];  // sum=sum+numbers[i];

        }
        System.out.println("The sum of al the numbers in the array is: " +sum);





    }
}
