package Day14_NestedLoops;

public class Topic5_NestedLoopsExp1 {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) {


            System.out.println("This is the First Outer Loop ");// this code will get executed 3 times
            for (int j = 0; j < 3; j++) {
                System.out.println("\tThis is the Second Outer / the First Inner Loop ");// this code will get executed 9 times
                for (int k = 0; k < 3; k++) {
                    System.out.println("\t\tThis is the second Inner Loop ");// this code will get executed 27 times
                }
            }


        }

    }
}
