package Day20_Methods;

public class Topic8_MethodsParamEx {
    // Write a method where it takes array of integers and print the sum of all the elements in the array

    public static void main(String[] args) {
        int [] ArraysInt = {56,7,8,23,4,5,6,3,2,5,6,8};
        SumArray(ArraysInt);
       // System.out.println("The sum is: " +sum); You CAN NOT do this ,because sum belongs the method

        System.out.println("++++++++++++++++++++++++");

        int [] nums ={78,-98};
        SumArray(nums);
    }


public static void SumArray(int [] numbers){
        int sum=0;
    for (int num:numbers) {
        sum=sum+num;
    }
    System.out.println("The sum of the array is : " + sum);
}


}
