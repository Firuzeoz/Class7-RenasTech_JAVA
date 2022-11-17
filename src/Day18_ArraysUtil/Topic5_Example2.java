package Day18_ArraysUtil;

import java.util.Scanner;

public class Topic5_Example2 {
    public static void main(String[] args) {
// Write a code where user id being asked to enter a Sentence
        // check for each word to see how many 4 char substring in the word is palindrome

        // " This Afternoon I found RRRRTESTdaad something that had  DIID on it."

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String sentence = scan.nextLine();

        String [] words = sentence.split(" "); //words = {"This","Afternoon","I"....}
        //Separate each word with space, based on space. Get each words as a string and put in to a words array!

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            String word = words[i];

            if(word.length()<4){
                continue;
            }
            for (int j = 0; j < word.length()-3; j++) { // Afternoon // noon substring(0,4)

                String sub = word.substring(j,j+4); // (0,4) subString(4,9) //cause first index included while last not included.
                String reverse="";
                for (int k = sub.length()-1; k >=0 ; k--) {
                    char c = sub.charAt(k);

                    reverse = reverse+c;

                }

                if(sub.equals(reverse)){

                    count++;

                }


            }
            System.out.println("The word:"+word+" has "+count+" Polindrome 4 char substring");

        }


    }
}
