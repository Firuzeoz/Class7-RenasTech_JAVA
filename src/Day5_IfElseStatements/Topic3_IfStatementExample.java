package Day5_IfElseStatements;

public class Topic3_IfStatementExample {

    public static void main(String[] args) {

        int a=89;
        int b=23;
        int c=547;


        if ((a>b) && (a>c)){

            System.out.println("The highest number is: "+ a);

        }

        if (b>a && b>c){
            System.out.println("The highest number is: "+ b);
        }

        if (c>a && c>b){
            System.out.println("The highest number is :" + c);
        }


if(a==b && b==c){
    System.out.println("All the numbers are equal");
}
else{
    System.out.println("All the numbers are different");
}




    }
}
