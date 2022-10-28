package Day9_Strings;

public class Topic2_StringMethods {
    public static void main(String[] args) {
        // when you type str you will see red m in library ,they are all methods of strings
        // we ll just gonna cover most common ones
       // when you use these characters you'll gonna have for exp if you use  charAt(), return will be chart .

/*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */
        //charAt()	          Returns the character at the specified index (position)	        char
        //Example:

        String str1="Tanya";//positions for Tanya : T is 0, a is 1,n is 2 , y is 4,a is 5
        char ch=str1.charAt(0); // when you type ch you ll see index ,means positions
        System.out.println("The char at the positions of 0 (or index 0)is: "+ch);
        System.out.println("The char at the positions of 0 (or index 0)is: "+str1.charAt(2));

       // concat()	          Appends a string to the end of another string	                    String
       //Example:
        String FirstName="Firuze";
        String LastName="OZ";
        String FullName=FirstName.concat(" " +LastName);
        System.out.println(FullName);

        String City="Toronto";
        String avenue="525 Wilson Avenue";
        String state="Ontario";
        String ZipCode= "M3H 0A7";
        String Address= avenue.concat(" "+ City +"/"+state+"/"+ZipCode);
        System.out.println(Address);

        //contains()	          Checks whether a string contains a sequence of characters	        boolean
        //It will turn as a boolean value, Example:
        String str3="This is a test";
        boolean con=str3.contains("test");
        System.out.println("Contains to test: "+con);

        String good="La vita e bella!";
        boolean life=good.contains("bella");
        System.out.println("Is the life beautiful? :): "+con);

        String status="Firuze has a older sister";
        boolean older=status.contains("sister");
        System.out.println("Firuze has a sister name Firuzan: "+con);

        //endsWith()	          Checks whether a string ends with the specified character(s)	 boolean
        //Examples:
          String str4="This is the String";
          boolean ends=str4.endsWith("ing");
         System.out.println("Does the String ends with ing? : "+ends);
         
         String lastTwo="Let's see what is gonna happen?";
         boolean see=lastTwo.endsWith("en");
         System.out.println("Is the last two character is en ? :" +see);

        // equals()	          Compares two strings.
        // Returns true if the strings are equal,and false if  not boolean
        //Example:this is check for the value
        String str5="Hello";
        String str6="Hello";
        boolean eq=str5.equals(str6);
        System.out.println("Let's see if two strings are equal? : "+ eq);

        String str7=new String("Hello");
        boolean eq1=str5.equals(str7);
        System.out.println("Are they equal in new keyword as well? : "+eq1);


       // equalsIgnoreCase()	  Compares two strings, ignoring case considerations boolean
       String str8="Andy";
       String str9="andy";
       boolean eq3=str8.equals(str9);
       System.out.println("Are they equal? : "+eq3);
       boolean eq4=str8.equalsIgnoreCase(str9);
       System.out.println("Are they equal when we ignore the case? : "+eq4);


        //indexOf()	:Returns the position of the first found occurrence of specified characters in a string,
        // return type int
        //Example: Basically we are looking for a single specific character's index in here.
        String str10="eloise";
        int pos=str10.indexOf('e');
        System.out.println("The index of 'e' on the string: "+pos);
                                  //bc arrays numbers of the arrays just int. there is no position for like 0.234
                                  // and the output will be first position
        String hib=" Kaan";
        int post=hib.indexOf('a');
        System.out.println("The index of the a is: "+post);

        //lastIndexOf():Returns the position of the last found occurrence of specified characters in a string
        // returns int , we will get the last position of the array
        String str11="eloise";
        int pos1=str10.lastIndexOf('e');
        System.out.println("The last index of 'e' on the string: "+pos1);
        String hib1=" Kaan";
        int post1=hib.lastIndexOf('a');
        System.out.println("The index of the a is: "+post1);


        //isEmpty(): Checks whether a string is empty or not,returns boolean
        String str12="";
        System.out.println("is String Empty: "+(str12.isEmpty()));

        //length(): Returns the length of a specified string,returns int
        //How many character in there?
        //Most using index might be.
        //Example;
        String str13=" ljahnsf;knfad98734rkjl90u32";
        System.out.println("The length of the String is: "+str13.length());



















    }
}
