package Day11_ForLoopCont;

import java.util.Scanner;

public class Topic4_ReverseString {
    public static void main(String[] args) {
        //Write a code where user is being asked to enter a string,reverse that string and print it.
        //Ugur==>rugU  // Sena==> aneS
        Scanner scan=new Scanner(System.in);//I want to read it from console.
        System.out.println("Please enter the something on the console that you want to reverse: ");
        String input=scan.nextLine();
        //String name="Ziya";
        char ch=input.charAt(0);
        System.out.println("The first character is: "+ch);
        char ch1=input.charAt(1);
        System.out.println("The second character is: "+ch1);
        System.out.println("The length of string is: "+input.length());
        System.out.println("The last character is: "+input.charAt(input.length()-1));

        String reverse= " ";
        for (int i =input.length()-1; i >=0 ; i--) {
           reverse=reverse+input.charAt(i); //reverse= " " +e ==> e
                                            //reverse=e+z ==> ez
                                            //reverse=ez+u ==> ezu
                                            //reverse=ezu+r ==> ezur
                                            //reverse=ezur+i ==> ezuri
                                            //reverse=ezuri+F ==> ezuriF


        }
        System.out.println("The reverse of the input is: " +reverse);

        //****************************************************************************
   // INTERVIEW QESTIOOOOOOOOOOOOOOOOOOOOOONNN ABOVE!!

    }
}
