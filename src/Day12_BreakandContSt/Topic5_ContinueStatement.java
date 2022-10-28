package Day12_BreakandContSt;

public class Topic5_ContinueStatement {
    //We use continue keyword to disregar that iteration when certain conditions are met
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
           // System.out.println("The i value for each iteration: "+i); if we print before if it will print it
            //cause it is before the statement
            if(i==5){
                continue; // when i==5 we just pass this iteration and continue without it
                // when i==5 just skip it
            }

            System.out.println("The i value for each iteration: "+i);

        }

    }
}
