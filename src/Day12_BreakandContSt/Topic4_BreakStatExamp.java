package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic4_BreakStatExamp {
    public static void main(String[] args) {

       // user is being asked to enter a name
        //And restructure the name but as son as it sees the "l" you should
        //stop restructure
        //Kyle == > Ky
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the name: " );
        String name=scan.next();

        String rename= " ";
        for (int i = 0; i <name.length(); i++) {
         //   rename=rename+name.charAt(i); //if we put in here it will stop AFTER l,will print l too.
            if(name.charAt(i)=='l'){
                break;
            }
            rename=rename+name.charAt(i);
        }
        System.out.println("The rename value is: "+rename);

    }
}
