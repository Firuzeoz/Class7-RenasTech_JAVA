package Day15_NestedLoops;

public class Topic2_WhileAndForNestedLoops {
    public static void main(String[] args) {


        int i=0;
        while(i<10){

            System.out.println("The i value is : "+i);//this will executed 10 times

            for (int j = 1; j <10 ; j++) {
                System.out.println("\tFor each i value: " +i+" , j value is: "+j);//this will executed 90 times
            }  // for each i value , j will executed 9 times
            System.out.println("*****");
            i++;

        }


    }
}
