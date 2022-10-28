package Day5_IfElseStatements;

public class Topic1_PrimitiveCasting {
    public static void main(String[] args) {
        // primitive casting is to change the primitive data type but when we do the casting from
        // lower level to upper level we will have issues.
        //we put type of data in front of it

        byte by=40;
        System.out.println("the byte value is : " + by);

        int inNum=(int)by; //int inNum=by;we can write it like this
        System.out.println("the value of int is : " + inNum);
        
        int a=89009798;
        short b=(short)a;
        System.out.println("b = " + b); //result b= 11910 // it gives max the binary number cut off result
        
        int num1=90;
        System.out.println("the num1 value in int is: "+num1);
        
        float num2=(float)num1;
        System.out.println("float num1 in num2 is = " + num2);

        int num3=89;
        int num4=23;
        float num5=num3/num4;
        System.out.println("the num5 is: "+num5);//it change to int/int=int and making it decimal thats why result is not true
        //if we do this style below , you have to cast the int
        float numm5=(float)num3/num4;
        System.out.println("the numm5 is: "+numm5);// if you cast it you will have a correct result





    }
}
