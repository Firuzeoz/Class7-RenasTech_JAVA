package z_Day20_MethodswithReturnParams;

import java.util.Arrays;

public class Topic4_Combine2Arraysto1 {
    // write a method where it takes 2 int arrays as input parameters
    // and combine those 2 arrays and returns to 1 integer array

    public static int [] MethodForArrays(int[] arr1,int [] arr2){
        int size=arr1.length+arr2.length;  //size= 13+8=21
        int [] Array3=new int [size];       //Array3={0,0,0,0,0,0,0,....,0,0} 21 elements

        for(int i=0;i<arr1.length;i++){ //we are adding arr1 to Array3
            Array3[i]=arr1[i];           //Array3[0]=arr1[0] //Array3={2,0,0,0,0,0,....,0,0,0}
                                         //Array3[1]=arr1[1] //Array3={2,3,0,0,0,0,0,...,0,0,0}
                                         //Array3[13]= 0

        } //now we are going to add arr2 to Array3
        int  j=0; // we declare another variable which starts from 0 for arr2 beginning index.
        for (int i = arr1.length; i <size ; i++) { // we cannot exceed size of iteration(arr1.length+arr2.length)
            Array3[i]=arr2[j];       //Array3[13]=arr2[0]==30 we continue forArray3 index when we left off from previous i
            j++;
        }
        return Array3;
    }

    public static void main(String[] args) {

        int [] array1={2,3,1,90,78,98,1,4,5,26,78,91,23};
        int [] array2={30,7,13,18,37,45,21,1985};
        int [] result= MethodForArrays(array1,array2);

        System.out.println("The returned array is: " + Arrays.toString(result));
    }

}
