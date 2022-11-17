package Day17_ArraysCont;

import java.util.Arrays;

public class Topic4_ArraysSort {
    public static void main(String[] args) {


        int[] nums={56,32,34,90,-345,-12,-34};
        Arrays.sort(nums); // Arrays.sort(the name of the array) will put the element in increasing order
        //and assign  .....      the original array
        // Arrays.sort() turning void means return
        System.out.println("The nums array now is: " +Arrays.toString(nums));
        System.out.println("The first element in nums: " + nums[0]);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");


        // above exp was int , we were sorting it from smaller to bigger number
        //below exp is String names , it is sorting the String alphabetical from the first order in alphabet

        String[] names={"Zeliha","Eloise","Hrakar","Amer"};
        System.out.println("The Array of names is: "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("The array of the names now: "+Arrays.toString(names));


        System.out.println("******************************************");
        Arrays.sort(names,0,3);
        System.out.println("The array of names now: " +Arrays.toString(names));


    }
}
