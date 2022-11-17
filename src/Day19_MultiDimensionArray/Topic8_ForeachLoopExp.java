package Day19_MultiDimensionArray;

public class Topic8_ForeachLoopExp {
    public static void main(String[] args) {
        //write a code where user check every string values in array
        //and see if that string has "a" in it:



        String [] str={"Alibaba","Omur","Gorkem","Nasrettin","Hoca"};

        for(String var:str){// var variable checking and changing every iteration in the collection

            if(var.contains("a") || var.contains("A")){

                System.out.println("The word: \""+var+"\" contains a or A");
            }else{
                System.out.println("The word: \""+var+"\" does NOT contains a or A");
            }


        }







    }
}
