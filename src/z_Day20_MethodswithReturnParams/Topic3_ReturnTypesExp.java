package z_Day20_MethodswithReturnParams;

public class Topic3_ReturnTypesExp {

    //write a method where it gets an Array of int as input parameter and return to the max number in the array

    public static void main(String[] args) {
        int [] arr={-90,-30,-20,-35};
        int maximum=MAX(arr);
        System.out.println("The maximum value in our array is = " + maximum);
        System.out.println("The other way to print Max value of our array = " + MAX(arr));

        // add 5 to the maximum value
      int addedversion=maximum+5; // methoda her defasina donmek yerine atadigimiz yere -yukari-gidip ordaki degeri kullaniyo
        //subs 1- from the max value;
      int subs=maximum-10;      // o sebepten methodu bir degere atayarak print etmek daha mantikli int maximum=MAX(arr);
// we do not need to call method , we are calling the executed max value al;ready.

    }

    public static int MAX(int [] Array){

        int max=Array[0];// index 0 in our array initial max olarak al.
        // if I assign 0 like this int max=0; //output max will be 0 , but we don't have 0 in our array
        for(int a:Array){
            if(max<a){
                max=a;
            }
        }
     return max;
    }
}
