package Day18_ArraysUtil;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Topic1_Split {
    public static void main(String[] args) {

        //They using this method a lot in loops
        //Split() method in Arrays Util,It creates a string Array based on the given String expression
        // this is only for Strings , it is string method, and it is returns to string
        String names="Ziya Hrakar Nilufer Sena";
        System.out.println("The String name is: "+names);
        String [] nm=names.split(" "); // it returns to split array
        System.out.println("nm contains: "+ Arrays.toString(nm)); // go and check every element, and when you see a space
        System.out.println("The length of array is: " +nm.length);// size will be 4 ,because it will split and count all element after space
        System.out.println("The first element is: "+nm[0]);
        System.out.println("*****************");

        System.out.println("++++++++++++++++++");
        String nums="21234567891223456";
        String [] numbers=nums.split("2"); // it is like an empty string like a space " "
        System.out.println("The numbers array is: "+ Arrays.toString(numbers));

        System.out.println("*******************");
        String var="ThisisjustaString";
        String [] var1=var.split("");
        System.out.println("The var1 values :"+Arrays.toString(var1));

        String forbid="Thisisjust a TEST";
        String [] tst = forbid.split("");// You cannot use (*,?,+) on the split
        System.out.println("______________");

        String var2="THISISTESTFORALI";
        String [] test = var2.split("",5); //result is : [T, H, I, S, ISTESTFORALI] , because we limit the array with 5 elements
        System.out.println("The test array is: "+Arrays.toString(test));


        System.out.println("*******************");
        String var3="This is just a test but I want to try again";
        String [] test1=var3.split(" ",20);
        System.out.println("The test1 values: "+Arrays.toString(test1));

    }
}
