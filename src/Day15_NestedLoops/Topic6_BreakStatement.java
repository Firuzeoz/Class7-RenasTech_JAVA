package Day15_NestedLoops;

public class Topic6_BreakStatement {
    public static void main(String[] args) {
        
        lbl: //it is just a name you can put i wherever you want
        for (int i = 0; i < 10; i++) {
            System.out.println("From outer loop i value: "+i);

            for (int j = 1; j < 10; j++) {
                if(i==5){
                    break lbl;//continue execution where the lbl level is ,in here lbl level is outside of the
                }
                System.out.println("\t\tFrom the inner loop i: "+i+" j value: "+j);

            }
        }


    }
}
