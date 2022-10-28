package Day10_StringMethods;

import java.util.Scanner;

public class Topic1_StringMethodsConts {
    /*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */
    public static void main(String[] args) {
      /*  replace():Searches a string for a specified value, and returns
        a new string where the specified values are replaced,return String
*/
        String name="Ziya";
        String Rename=name.replace('Z','Y');
        System.out.println("The new value after replace: "+Rename);
        //name=name.replace('y','x');   this will reassign the name variable to Zixa
        System.out.println("The value of the name: " +name);

        String name1="Andrew";
        String Rename1=name1.replace("An","EX");//EXdrew
        System.out.println("The new value after replace: : " +Rename1);
    /*    replaceFirst():Replaces the first occurrence of a substring that matches the
        given regular expression with the given replacement,returns to String
        */

        String name3="Kaan";
        String Rename3=name3.replaceFirst("a","v");
        System.out.println("The new value after replace: "+Rename3);
        System.out.println("***********************");
    //    startsWith(): Checks whether a string starts with specified characters,returns boolean
         String namee="Eloise";
         boolean checkname=namee.startsWith("Eloise");
         System.out.println("Does namee start with E: " +checkname);

        System.out.println("*************************************");
      /*  substring():Extracts the characters from a string,beginning at a specified start position,
        and through the specified number of character,returns to String
*/
           String name4= "Firuze";
           String subName=name4.substring(2); //starting point as an index
           System.out.println("The substring value is = " + subName);
           String name5="AliEkinci";
           String subName1=name5.substring(2,6);//starting point included-ending point not included!
           System.out.println("Starting point included-ending point not included int this substring value= " + subName1);

       // toLowerCase():Converts a string to lower case letters,returns to String
        System.out.println("**************************");
        String name6="Firuze Oz";
        String lower=name6.toLowerCase();
        System.out.println("The value of the converted lower case " + lower);
        //toUpperCase():Converts a string to upper case letters,returns to String
        String name7="Firuze Oz";
        String upper=name7.toUpperCase();
        System.out.println("The value of the converted to UPPER case " + upper);
        System.out.println("*****************************");
        //trim():Removes whitespace from both ends of a string,returns to String
        String name8="    Onur Kazman   ";
        System.out.println(name8);
        System.out.println(name8.trim());





    }
}
