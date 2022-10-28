package Day15_NestedLoops;

public class Topic5_breakContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("from outer loop i value: "+i);
            for (int j = 1; j <10 ; j++) {
                if (i == 5) {
                break;
                }
                System.out.println("j = " + j);
                }
            }
        }
    }

