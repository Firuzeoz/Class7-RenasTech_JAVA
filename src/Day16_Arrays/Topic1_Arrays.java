package Day16_Arrays;

public class Topic1_Arrays {
    public static void main(String[] args) {

        //For the variable we are doing;
        //DataType name=value;

        //For the Arrays:Are the containers where they hold multiples in the same data types.
        //DataType [] name={value1,value2,value3}

        int num1=78;
        int [] array1={78,23,91,34};
        //In arrays index starts from 0 .

        int [] array2={67,         90,          27,           10};
                     //index 0      index 1     index2      index 3



        //if i want to get a number in index 0  will be ==> array2[0],
        System.out.println("The first number in array us: "+array2[0]);
        System.out.println("The second number in array us: "+array2[1]);
        System.out.println("The third number in array us: "+array2[2]);
        System.out.println("The fourth number in array us: "+array2[3]);


        int var3=array2[2];
        System.out.println("The var3 value is: "+var3);
        System.out.println("**********");

        //Boolean data type arrays
        boolean [] BoolArray={true,false,true,true};
        System.out.println("The value in index 3 in BoolArray is: "+BoolArray[3]);
        boolean var=BoolArray[1];
        System.out.println("The var value is= " + var);
        System.out.println("**************");

        //double data type arrays
        double [] DobArray={98,65,8778,23}; //90 = 90.00
        System.out.println("The value in index 0 is: " + DobArray[0]);

        //String arrays
        String[] stringArraynames={"Cheesus","Harakar","Ziya","Nelly",null};
        System.out.println("The name is: " + stringArraynames[3]);
//null means nothing means object pointing to nowhere,not empty r not 0.
        System.out.println("The value in index 4 is: " + stringArraynames[4]);

        // the yellow line under the above ,system says hey you are pointing it but it is null

    }
}
