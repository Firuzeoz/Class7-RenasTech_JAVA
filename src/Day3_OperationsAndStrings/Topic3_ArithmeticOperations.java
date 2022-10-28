package Day3_OperationsAndStrings;

public class Topic3_ArithmeticOperations {
    public static void main(String[] args) {


        //(+)Addition
        int num1=90;
        int num2=80;
        int num3=num1+num2;
        System.out.println("The result is : " +num3);
        System.out.println(num1+num2);
        System.out.println("this is the result int different way: " + num1+ " " + num2);
        System.out.println("this is the result int different way: "+(num1+num2));



int num4 =300;
float num5=98.56F;
float num6=num4+num5;

int num7=num4+(int)num5;

System.out.println("The result is : " + num6);
System.out.println("The result is : " + num7);

double num8=98.4568789;
int num9=900;
double num10=num8+num9;
System.out.println("This is the result is: " +num10);


        // (-) Subtraction:
        int num11=67;
        int num12=9000;
        int result=num11-num12;
        System.out.println("The result is: "+result);

       // (*) Multiplication:
       int num13=95;
       int num14=98;
       int result1=num13*num14;
       System.out.println("The result of the multiplication is : " + result1);


        double num15=89.543;
        double num16=87;
        double result2=num15*num16;
        System.out.println("The result is : " + result2);

        // (/)Division:
       int num21=89;
       int num22=40;

       int num23=num21/num22;
       double num24=num21/num22;
       float num25=num21/num22;
       float num26=(float)num21/num22; // CASTING : Turning the int to a float in the result,for the exact result
        System.out.println(num23);
        System.out.println(num24);
        System.out.println(num25);
        System.out.println(num26);

        //we cannot divide a double num/double num2  and expecting an int result,it will give errors


       //(%)Modulus (mod) : get the reminder of the division
        int num27=98;
        int num28=3;
        int result3=num27%num28;
        System.out.println("The mod result is: "+ result3);

        double num29=90.48;
        double num30=8.56;
        double result4=num29%num30;
        System.out.println("The mod result is for double: " + result4);




    }
}
