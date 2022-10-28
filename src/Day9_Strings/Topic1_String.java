package Day9_Strings;

import java.util.Scanner;

public class Topic1_String {
    public static void main(String[] args) {
        //when we create an object there are 2 ways to we can create instance
        //String literal
        //String name= "Ziya";
        //Another way to create another string
/*
            in Java, string is an object that represents a sequence of characters.
            The java.lang.String class is used to create a string object.
            String name = "hsgdjahsdknaksdn";

            How to create a string object?
            There are two ways to create String object:

            1.By string literal
            String str= "Class"; // Pool
            String str2 = "Class";
            2.By new keyword
            String str1 = new String("Class1"); // heap memory
            String str4 = new String("Class1");
        */
        //create a string object
        // 1.By string literal
        //Java String literal is created by using double quotes.
        // For Example:
        //String str1="Hello";

        //Each time you create a string literal, the JVM checks the "string constant pool" first.
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.


        /*

        String str4 = new String("Class1");
        Scanner scan = new Scan (System.in);   // dikkat edersen birbirine benziyor

       difference between 2 method,is we are placing them in different memory
        when you use new key it use the heap memory when you do the literal way it use pool memory. So we ll use new more .

        We can create Ziya value again , bc it already in pool memory in below
        String name="Ziya"
        String name1="Ziya"

        So instead creating a new one pointing the that existed value to use it again :)It gives more efficiency. Fuck I guess it is makes sense finally!
        Class1 value will be creating and assigning the str3 and str1



*/

        String andy = "Hello";
       String andrew ="Hello";
       String sena = new String("Hello");
        // don't type original , just double quote, it will come up
       boolean isEqual=(andy==andrew);
        System.out.println("Are they equal? : "+isEqual);
        System.out.println("Are the others equal? : "+(andrew==sena)); //thi sis check for the location







    }
}
