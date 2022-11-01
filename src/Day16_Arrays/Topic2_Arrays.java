package Day16_Arrays;

public class Topic2_Arrays {
    public static void main(String[] args) {
        //We can define an array with a size but not add any values
        //Int default value is 0 // also for byte,short, and long too
        //DataType [] name = new DataType[size/length] // new is a keyword

        int [] intArray = new int[4]; //{0,0,0,0}
        //this will populate intArray with 0 values ,because default value of int is 0
        System.out.println("The index 0 value in antArray is: " + intArray[0]);
        System.out.println("The index 1 value in antArray is: " + intArray[1]);
        System.out.println("The index 2 value in antArray is: " + intArray[2]);
        System.out.println("The index 3 value in antArray is: " + intArray[3]);
        //System.out.println("intArray = " + intArray);
        //if we don't specify the index number,this is the object jdbfjb of code
        //some says this is the hash code of the code

        System.out.println("***********************************************************************************");
        double [] doubArray=new double[3];// {0.00,0.00,0.00,0.00} for the double default i
        System.out.println("The value of index 1 in doubArray: "+doubArray[1]);

        System.out.println("***********************************************************************************");
        char[] charArray=new char[4];// { , , , } the default value for char is in array is actually random shape maybe a space
        System.out.println("The default value of the char= " + charArray[1]);

        System.out.println("***********************************************************************************");
        String [] stringArray=new String[3]; // {null, null,null} default value for String is null, bc String is a non-primitive type
        System.out.println("The default value of the string: " + stringArray[0]);
        //Null String with the value of the null point to the nowhere, it is not pointing to any object or anywhere
        //Empty String points to the Empty String
        //null and empty is not the same


        //once an array size or length is defined, it cannot be changed what you can do create another array
        // and put all the values in the new array
        //the size of Array is STATIC size or length!!
        // what is the difference between array and arraylist can be asked on Interview

    }
}
