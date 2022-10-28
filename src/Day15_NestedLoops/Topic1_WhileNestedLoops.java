package Day15_NestedLoops;

public class Topic1_WhileNestedLoops {
    public static void main(String[] args) {

        /*
        * while(condition){
          First Code Block
               while(){
               Second Code Block
          }
        } */


        int i=0;

        while(i<10){
            System.out.println("The value of i: "+i);
            int j=1;
            while(j<10){

                System.out.println("\tFor each i: " +i+ " value "+"the j value: "+j);
                j++;
            }
            System.out.println("******* ");
            i++;
        }




    }
}
