package Day4_Operators;

public class Topic2_LogicalOperations {
    //Without log opr. our comp never work.
    // We check for multiple things that they are meeting with the conditions
    public static void main(String[] args) {
        /*
          AND  " && "  :
        In order to result true for the operation,  all the operations should be true
        Everything MUST be true , if one of them F in the statement you don't have to check the rest cause result will be False.
        */
        boolean checklogic = true&&true;
        System.out.println("check the logic = " + checklogic);

        boolean logic1= (78==90)&&(876 != 8907)&&(98>23);//F && T && T , we have 1 f , so result is False.
        System.out.println("logic1 = " + logic1);

        boolean logic2= false&&false&&false;
        System.out.println("logic2 = " + logic2);//We have 3 F, all course result will be F :)
        
        // OR  " || "  it  is enough to have only one True in the statement for the result True.
        boolean logic3= false||false||false||true;
        System.out.println("logic3 = " + logic3);
        
        boolean logic4= !((90==90)||(90!=80)||(76>90)); // !(F||T||F) we have 1T, result is T, but we have a not at the beginning means turned to F :)
        System.out.println("logic4 = " + logic4);

        boolean logic5 = ((89==89)&&(45>=23) || ((67<=90)&&(true))); // T || T ,will be T
        System.out.println("logic5 = " + logic5);



    }
}
