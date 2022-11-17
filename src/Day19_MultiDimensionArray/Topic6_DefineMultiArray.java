package Day19_MultiDimensionArray;

import java.util.Arrays;

public class Topic6_DefineMultiArray {
    public static void main(String[] args) {
        int [] numbers=new int[4]; // {0,0,0,0}
        int [][] nums= new int [2][3];// {{0,0,0},{0,0,0}

        System.out.println("The nums array: " + Arrays.deepToString(nums));

        nums[1][2]=79;
        System.out.println("The nums array: "+Arrays.deepToString(nums));

        //Example: Define a 2D array with size of 2,4 respectively
        //assign all the odd numbers starting from 1, as elements to the array:

        int start=1;//this should be cumulitive , that's why we define it outside the loop
        int[][] odds=new int[2][4];//{{0,0,0,0},{0,0,0,0}}
        for (int i = 0; i < odds.length ; i++) { // u can use i<2 if you now the size , here is 2
            // int start=1; if i would put this in here, it couldn't reset the loop ,put outside the loop
            for (int j = 0; j < odds[i].length; j++) {//u can use j<4 if you know the size,here is 4
               odds[i][j]=start; // {{1,1,1,1},{1,1,1,1}}
                start=start+2; // start value will change starting from 1,3,5,7,9+
            }

        }
        System.out.println("The odds array is : " + Arrays.deepToString(odds));


    }
}
