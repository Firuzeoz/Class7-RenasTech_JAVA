package Day13_WhileLoop;

public class Topic3_WhileBreak {
    public static void main(String[] args) {

        //print all the numbers 1 to 10 but when the number is 5 break the loop-don't print 5
        //starting point can be 0 or 1 we ll try both

        int start=1;

        while(start<10){

            System.out.println("The numbers are :" +start);
            start++;
                if(start==5){
                    break;
                 }

        }
//Print all the characters in String value of "Nawras" but break it when there is char 'a', when you see first 'a' stop the loop

        String name="Nawras";
        int i=0;// starting from index number 0

        while (i<name.length()){

           // System.out.println("The char at index "+i+" is: "+name.charAt(i));
           //it will print first 'a' , if u put println here
            if (name.charAt(i)=='a'){
                break;
            }

            System.out.println("The char at index "+i+" is: "+name.charAt(i));
            i++; //if we don't increment i value , it will go infinite N value on console
                 // cause i stays=0 and it is<total index number =6 ,0<6 olur.
        }







    }
}
