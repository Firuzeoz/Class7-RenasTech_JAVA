package Day3_OperationsAndStrings;

public class Topic2_Strings {
    public static void main(String[] args) {

        //String is one of the non-primitive data type,String are not primitive data type

        //holds a single value not hold one value,they can hold multiple values

        //Datatype name= "a value";  value has to be between double quote!


        String name="Firuze OZ";
        System.out.println(name);

        String prag = "This is a paragraph. I wanted to print this out as well.";
        System.out.println(prag);


        String spc="184%36%^!^&**($$54kjbdfgbv ";
        System.out.println(spc);

        String numbers="123456"; //putting numbers as a text, cannot be using as calculation.
        System.out.println(numbers);

        //Combine to text
        String txt1="This is text1 ";
        String txt2="THIS IS THE text2";
        String txt3=txt1+txt2;
        System.out.println(txt3);

        String number2="98";
        String number3=" 80";
        String number4=number2+number3;
        System.out.println(number2+number3); //Output will be 98 80 ,cause they are text
        System.out.println("This is Hello World! ");
        /*System.out.println(); this is a methods actually ,
         whatever inside the double quotes
         I can add something like that:  */

        System.out.println("This is Hello World!\t"+"This is 2nd Hello World! "+"This is 3rd Hello World! ");

//Below can be applied any other variables
        int num=89;
        System.out.println("This is the number from int : " +num);




    }

}
