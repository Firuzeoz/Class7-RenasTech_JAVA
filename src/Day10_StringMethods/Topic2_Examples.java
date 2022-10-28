package Day10_StringMethods;

import java.util.Locale;
import java.util.Scanner;

public class Topic2_Examples {
    public static void main(String[] args) {
        String name="Baran Cevrim"; // BarCev
        String newName=name.substring(0,3)+name.substring(6,9);
        System.out.println(newName);

Scanner scan=new Scanner(System.in);
System.out.println("Please enter first name: ");
String FirstName=scan.next();
System.out.print("Please enter the last name: ");
String LastName=scan.next();
String changed=(FirstName.replace('a','x')+LastName.replace('e','a')).toUpperCase();
System.out.println("The value of the changed is: "+changed);

    }
}
