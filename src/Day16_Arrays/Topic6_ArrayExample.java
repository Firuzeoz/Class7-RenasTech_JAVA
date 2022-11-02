package Day16_Arrays;

public class Topic6_ArrayExample {
    public static void main(String[] args) {

        //write a code where you find the maximum number in the given array below:
        // arr = {56,23,1,90,31,54,67,87,100,24}
        int [] arr = {56,23,1,90,31,54,67,87,100,24};

        int max= arr[0]; // now we started from index 0 , and assumed that it is max
                      // I am not predefining this value cause array may include minus numbers
                      // and if ve initialize it with 0, there is no eve 0 in array , so don't define it
                      //int max=Integer.MIN_VALUE; we could also use this
        for (int i = 0; i < arr.length ; i++) { // we could start from int i=1;when int max=arr[0] because we already assigned max for index 0
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The max value is: "+max);

        //find the minimum number
        int  min=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The minimum value is: "+min);
    }
}
