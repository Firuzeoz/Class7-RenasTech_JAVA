package Day19_MultiDimensionArray;

public class Topic2_MultiDimensionArraysExp {
    public static void main(String[] args) {

        String [][] names={{"Ziya","Seda"},{"Sena","Anil","Hrakar"}, {"Ferah","Onder","Fahrettin","Amer"}};

            //Index           names[0]           names[1]                        names[2]

        //String [] regular=names[0] =={"Ziya","Seda"}
        //regular[1] == "Seda" ===> name[0][1] ==>"Seda"

        String [] regular =names[0];
        System.out.println("The value in index 1: "+regular[1]);
        System.out.println("The value in index 1: "+names[0][1]);

        //Getting the length(Size) of multidimensional arrays
        int namesLen=names.length; // 3 size //outer Array
        System.out.println("The outer Array Size is = " + namesLen);
        // names[0], names[1], names[2] ==> names[index].length == to find inner array's length
        System.out.println("The inner Array in names[0] size is = " + names[0].length); //Getting inner Array size
        System.out.println("The inner Array in names[1] size is = " + names[1].length); //Getting inner Array size
        System.out.println("The inner Array in names[2] size is = " + names[2].length); //Getting inner Array size



        int [][] nums = { {1,2,3,4,5,6,2,1},   {908,3,4,5,2,3,2,1,87,4,5,6,90,7,7}};

        System.out.println("the length of nums array is: "+ nums.length);

        System.out.println("the length of nums[0]: "+nums[0].length);



    }
}
