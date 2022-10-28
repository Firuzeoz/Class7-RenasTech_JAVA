package Day4_Operators;

public class Topic1_RelationalOperators {
    public static void main(String[] args) {
        //"==" Check if 2 things are equal.

        boolean check= 2==8;
        System.out.println("The answer is: " + check);

        int a=90;
        int b=110;
        boolean check1= a==b;
        System.out.println("Is a equal to b?: " + check1);

        boolean check2= 20==20;
        System.out.println("Is 20 equal to 20?: " + check2);

        // "<" : Check if one thing is less than the other

        boolean check3= 60<110;
        System.out.println("Is 60 less than 110? " +check3);


        //">": Check if one thing is greater than the other.
        boolean check4= 90>40000;
        System.out.println("Is 90 greater than 4000? "+ check4);

        //" <= " : Check is one thing is less than another thing or equal to it.
        boolean check5= 100<=500;
        System.out.println("Is 100 less than 500 or 100 equal to 500 ? " + check5);

        boolean check6= 900<=900;
        System.out.println("Is 900 less than 900 or 900 equal to 900 ?" + check6);

        //" >= " :Check is one thing is greater than another thing or equal to it.

        boolean check7= 956>=125;
        System.out.println("Is 956 greater than 125 or 956 equal to 125 ? " + check7);


        //" != " : Check if 2 things are not equal.
        //if equal it will turn false, if not will turn true

        boolean check8= 90!=90;
        System.out.println("Not equal? " + check8);

       //" ! " : convert to opposite value.
        boolean check9= !(234!=789);  // Because,I want to convert to opposite this result to another
        System.out.println("Will return to: " + check9); // (234!=789) is true ,then converted to false with adding !

        boolean check10= !(!(234!=789));  // Because,I want to convert to opposite this result to another
        System.out.println("Will return to: " + check10); // !(234!=789) is false ,then converted to true with adding !

        boolean check11 = !(!(90==23)==!(98>98));
        System.out.println("check11 will turn into  = " + check11);

    }
}
