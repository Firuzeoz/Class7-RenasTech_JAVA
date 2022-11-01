package Day17_ArraysCont;

import java.util.Arrays;// there is class from comes from utility

public class Topic3_ArrayUtils {
    public static void main(String[] args) {
        int[] numbers={78,34,12,31,45};
        //Arrays.toString(numbers);
        System.out.println("All the elements in array; " + Arrays.toString(numbers));
        //it is string representation of my array
        //it doesn't matter if it is number -char or even string
        //this is not my array anymore it is string after this
        //i didn't change numbers of array-they are still in there
        //returning is string we didn't change anything

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number: "+numbers[i]);
        }


        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        String[]nms={"Ali","John","Rami"};
        String nms1=Arrays.toString(nms);
        System.out.println("This is the String rep of nms Array: "+nms1);





    }
}
