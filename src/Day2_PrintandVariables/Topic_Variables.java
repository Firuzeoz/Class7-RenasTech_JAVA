package Day2_PrintandVariables;

public class Topic_Variables {
    public static void main(String[] args) {


    //variables: are the containers where they hold the values for us

    /* primitive type-objective type
     primitive data type: simple, basic .


       Primitive Data Types
        A primitive data type specifies the size and type of variable values, and it has no additional methods.

                There are eight primitive data types in Java:

         Data Type               Size             Description
         byte                    1 byte           Stores whole numbers from -128 to 127
         short                   2 bytes          Stores whole numbers from -32, 768 to 32,767
         int                     4 bytes          Stores whole numbers from -2,147,483,648 to 2,147,483,647
         long                    8 bytes          Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


         float                   4 bytes          Stores fractional numbers, Sufficient for storing 6 to 7 decimal digits
         double                  8 bytes          Stores fractional numbers, Sufficient for storing 15 decimal digits

         boolean                 1 bit            Stores true or false values
         char                    2 bytes          Stores a single character/letter or ASCII values   'a'
     */

    /*
Primitive Data Types
1) boolean ==> Holds 2 values, true or false
2) byte == > holds the whole number in range of -128 to 127
3) char ==> holds the characters for the instance c, or R, or " or }
4) short==> holds whole number in the range of -32768 to 32767
5) int==>  holds whole number
6) long==> holds the whole number
7) float ==>  holds decimal numbers up to 7 decimal digit
8) double ==> holds decimal numbers up to 16 decimal digit
        */

        //type name=value; true or false

        boolean theName= true ;
        System.out.println(theName);

        boolean defValue=false;
        System.out.println(defValue);

        //type name=value; between -128 127
        byte aNumber=10;
        System.out.println(aNumber);

        //type name=-value; short for characters,only holds one character
        char aChar= 'H' ;
        System.out.println(aChar);






    }
}
