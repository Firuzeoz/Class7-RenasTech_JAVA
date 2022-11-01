package Day16_Arrays;

public class Topic4_ArrayExamples {
    public static void main(String[] args) {

        int[] arr={9,3,4,5,2,10,34};
        System.out.println("The size/length is: "+arr.length); //length method returns to int length of the array

        int leng= arr.length;//length method returns to an integer value which is the size or the length of the array
        System.out.println("The variable leng is the length of the array: "+leng);


        System.out.println("The value in index 0 : "+arr[0]);
        System.out.println("The value in index 1 : "+arr[1]);
        System.out.println("The value in index 2 : "+arr[2]);
        System.out.println("The value in index 3 : "+arr[3]);
        System.out.println("The value in index 4 : "+arr[4]);
        System.out.println("The value in index 5 : "+arr[5]);
        System.out.println("The value in index 6 : "+arr[6]);


        System.out.println("**************************");
        for (int i = 0; i < arr.length ; i++) {  // or we can write i<7 //or i<=arr.length-1
                                                 // actually i<=arr.length-1 == i<arr.length
            System.out.println("The value in index "+i+" : "+arr[i]);

        }










    }
}
