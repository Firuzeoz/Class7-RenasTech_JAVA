package Day12_BreakandContSt;

public class Topic2_BreakStatement {
    public static void main(String[] args) {
        //break: get out current code block
        // we use the break statement in for loop to get out of the loop when certain conditions are met
      // if we don't put it end of the code will be unreachable, it will give error like this.
        for (int i = 0; i <10 ; i++) {
            System.out.println("This is a code line");
            break;
        }
// we check certain conditions if it is met
        System.out.println("This is outside of the for loop");
        for (int i = 0; i <10 ; i++) {
            break;
        }

    }
}
