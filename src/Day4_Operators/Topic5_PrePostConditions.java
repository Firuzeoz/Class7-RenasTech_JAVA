package Day4_Operators;

import java.util.Arrays;

public class Topic5_PrePostConditions {
    public static void main(String[] args) {

        int a=46;
        int b=43;
        System.out.println(a+b);

// (++) is increment,which is by 1
        int num=56;
        System.out.println(num++); //post condition,mit changes value after executed.

       int num2=23;
       System.out.println("num2 = " + num2++);
       System.out.println("num2 = " + num2);


//++variable increase and assign;
        int num3=81;
        System.out.println(++ num3);
//(--) decrement
        int num4=63;
        System.out.println(num4--);
        int num5=37;
        System.out.println(--num5);
        

    }
}
