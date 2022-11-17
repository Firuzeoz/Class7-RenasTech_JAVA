package Day19_MultiDimensionArray;

public class Topic9_ForeachExp2 {
    public static void main(String[] args) {

        //exp: count how many ch  in name string??
        String  name="Hrakar Ali Amer";

        //for (char ch:chArray) we can not do this in char , cause char not a collection
        //what we can do is;

        char [] chArray= name.toCharArray();//convert your string to character
            //Get every single character in the string and put inside the char array
//

        int count=0;     //cause in the beginning we don't have any ch in array
        for (char ch:chArray) {
            if(ch=='a' || ch == 'A'){
                count++;
            }
        }
        System.out.println("The count od a's in the "+name+" string is: " +count);


    }
}
