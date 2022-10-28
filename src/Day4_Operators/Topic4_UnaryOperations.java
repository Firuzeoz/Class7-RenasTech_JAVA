package Day4_Operators;

public class Topic4_UnaryOperations {
    public static void main(String[] args) {
        // (+) does not any effect on the value
        int anum=900;
        anum=+anum;
        System.out.println("the value of the anum " +anum);

        int anum2= -9000;
        anum2=+anum2;
        System.out.println("anum2 = " + anum2);
        
        // (-) converts to opposite sign
        int anum3 = -788;
        anum3= -anum3;
        System.out.println("anum3 = " + anum3);

        int anum4= 345;
        anum4 = -anum4;
        System.out.println("num4 = " + anum4);

       //(++) this will increase the number by one
        int anum5=94;
        anum5++;       // anum5=anum5+1;
        System.out.println("anum5 = " + anum5);
        anum5++;
        System.out.println("anum5 = " + anum5);
        ++anum5;
        System.out.println("anum5 = " + anum5);
        
        
        // (--) this will decrease by 1;
        int anum6=36;
        anum6--;         //  anum6=anum6-1;
        System.out.println("anum6 = " + anum6);
        --anum6;
        System.out.println("anum6 = " + anum6);

        
    }
}
