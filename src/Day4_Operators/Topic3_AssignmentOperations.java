package Day4_Operators;

public class Topic3_AssignmentOperations {
    //Basically assigning a value to a variable

    public static void main(String[] args) {

        int a =80;
        System.out.println("the a value is:  " + a);

        a=90; // a value is 90 now.
        System.out.println("a = " +a);

        a=a+40;
       //or  a+=40;  get a value,add 40 and assign back to a.At this point a value is 130.
        System.out.println("a = " + a);
        a+=40;  //get a value,add 40 and assign back to a.At this point a value is 170.
        System.out.println("a = " + a);

        a=50000000;
        System.out.println("a = " + a);

        a+=40;
        System.out.println("a = " + a);

        int b=100;
        b=b-30;
        System.out.println("b = " + b);


        b-=10;
        System.out.println("b = " + b);
        int answer= b-a;
        System.out.println("answer = " + answer);



    }
}
