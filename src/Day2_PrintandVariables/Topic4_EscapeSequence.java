package Day2_PrintandVariables;

public class Topic4_EscapeSequence {

    public static void main(String[] args) {

        //   \t  it is going to leave paragraph space on the console, 5 regular spaces
        System.out.println("This is the line and if I want to \tput a paragraph space");

        //  \n  It is going to move on new line on the console
        System.out.println("This is a code where I go to \nnext line");

        //  \"  Double quote
        System.out.println("\nThis is \"Firuze\" ");

        //  \'  Single quote
        System.out.println("\tThis is \'single quote\'");


       //   \\ will print only one \ backslash
        System.out.println(" \"\\ Firuze \\\"");

//Examples:
        System.out.println("This is \\\\Firuze\\\\");
        System.out.println("This is \\Firuze\\");
        System.out.println("This is \'\\Firuze\\\'");



    }

}
