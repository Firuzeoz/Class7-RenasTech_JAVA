package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic3_ArraysEqual {
    public static void main(String[] args) {
        //there is a way to check if two arrays equal,return will be boolean
        //to be equal should be both arrays elements in the same index and same value
        int [] num1 = {9,8,7,3,4,5};
        int [] num2= {9,8,7,3,4,5};


        System.out.println("Is num1 and num2 equal : "+Arrays.equals(num1,num2));

        int [] num3={3,4,5};
        int [] num4={4,3,5};
        System.out.println("Is num3 and num4 equal : "+Arrays.equals(num3,num4));

        char [] ch ={'M','F','O'};
        char [] ch1={ 'm','F','O'};
        System.out.println("Is ch and ch1 equal : "+Arrays.equals(ch,ch1)); // return F, because every element should be same, even upper cases.


    }
}
