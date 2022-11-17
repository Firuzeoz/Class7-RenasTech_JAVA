package Day19_MultiDimensionArray;

public class Topic7_ForeachLoop {
    public static void main(String[] args) {

        String [] names= {"Ziya","Ali","Nureddin","Amer"};

        for (int i = 0; i < names.length ; i++) {
            System.out.println("The name is : "+names[i]);
        }
        System.out.println("**********************");

        //if we don't want to use index just
        for(String name:names){
            System.out.println("The name is : "+name);
        }
        //assign a name variable
        //it works for any type
        /*
        for (Datatype variableName: Collection){
           Code Block
                  }
        */

        System.out.println("+++++++++++++++++");


        int [] numbers ={3,4,5,6,12,12345,785};
        for(int a:numbers){
            if(a%2==0){
                System.out.println("number "+a+" is even");
            }else{
                System.out.println("number "+a+" is odd");
            }

        }


    }
}
