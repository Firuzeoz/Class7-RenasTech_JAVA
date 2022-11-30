package z_Day20_MethodswithReturnParams;

public class Topic1_ReturnTypes {

    public static void Count(int [] name){
        //how many items in array

        System.out.println("The count of items in the array is: " +name.length);
        Sum(name);
    }
    public static void Sum(int [] name1){
        int sum=0;
        for (int a:name1) {
            sum=sum+a;
        }
        System.out.println("The sum of the all items in the array is : "+sum);
     }


            public               static          void     main(String[] args) {
//access modifier      ,       specifier  , return type ,name,input parameters(arguments or parameters)

                int [] arr={3,4,5,6,7,8,9};
                Sum(arr);
                Count(arr);




    }



}
