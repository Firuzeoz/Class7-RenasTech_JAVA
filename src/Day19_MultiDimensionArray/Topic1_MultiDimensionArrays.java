package Day19_MultiDimensionArray;

public class Topic1_MultiDimensionArrays {
    public static void main(String[] args) {
        //multidimensional arrays are basically array inside of array

        //names ={{"Ziya","John","Eloise"}, {"Anil","Rami"}};

int [] [] numbers ={ { 3,4,5,6,7,8}, {8,7,3,4,1,0,-123},{90,23,145,109,107}};
        //outer index left,inner index right
int a = numbers[0][1];
        System.out.println("Number a is: "+a);
        System.out.println("The number is : " +numbers[1][6]);
        System.out.println("The number 2 is : " +numbers[2][3]);


        int len=numbers.length;
        System.out.println("The length of the array is: "+len);



    }
}
