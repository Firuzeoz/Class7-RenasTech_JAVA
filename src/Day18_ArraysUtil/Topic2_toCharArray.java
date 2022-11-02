package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic2_toCharArray {
    public static void main(String[] args) {

        String name="This is Ziya Yilmaz";
        char [] ch = name.toCharArray(); //It returns to a char array with every single char in the String
        System.out.println("This is char arrays: "+ Arrays.toString(ch));

        //"R", 'R'
        String test= "This is a Test";
        String [] StrArray=test.split(" ");//thiss will contain a string
        char [] ChArrayt=test.toCharArray();//this will contain character
        System.out.println("StrArray = " + Arrays.toString(StrArray));
        System.out.println("ChArrayt = " + Arrays.toString(ChArrayt));

    }
}
