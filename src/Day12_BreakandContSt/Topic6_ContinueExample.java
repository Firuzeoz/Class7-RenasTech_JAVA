package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic6_ContinueExample {
    //   write a code where user is being asked to enter a name
    //   restructure the name to not contain 'l' or 'L'
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name=scan.next();
        String rename=" "; // we have to start from somewhere
        for (int i = 0; i < name.length(); i++) {
            
            if (name.charAt(i)=='l' || name.charAt(i)=='L'){
                continue;
            }
            rename+=name.charAt(i); // rename= " "+a ==> rename = a //that's why we defined rename string
                                    //rename=a+e ==> rename =ae
        }
        System.out.println("rename = " + rename);
    }
}
