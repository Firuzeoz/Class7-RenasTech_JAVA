package Day13_WhileLoop;

public class Topic4_WhileContinue {
    public static void main(String[] args) {


        //print all the numbers between, 1 to 10 accept number 5,8,2

        int i=1;

        while(i<10){


            if (i==5 || i==8 || i==2){
                i++;
                continue;


            }
            System.out.println("All the numbers: "+i);
            i++;


        }


        System.out.println("**************************************");


        //print all the chars in the string "Nawras" except char 'a'

        int j=0;
        String name1="Nawras";

        while(j<name1.length()){


            if(name1.charAt(j)=='a'){
                j++;// if i do not increment j in here, code will be block in here.
                continue;
            }
            System.out.println("The char at the index " +j+ " is: "+name1.charAt(j));
             j++;

        }




    }
}
