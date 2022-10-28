package Day7_SwichStatements;

public class Topic1_IfElseExample {
    
    //write a code where students are placed in the classes based on individuals prefence and knowledge
    //Our scholl allows student to have only one preference
    //advanced-Mid-Beginner level classes
    public static void main(String[] args) {
        
        /*
        ref 
        level 
                lev 1 begin
            lev2 mid
                    lev3 adv.
        
        */
        
        String firstName="Firuze";
        String Pre="FA";
        int level=3;
        
        if ( Pre=="QA"){

            if (level==1){
                System.out.println(firstName+" is placed in Beginner Level Class for QA");
            }
            else if (level==2) {
                System.out.println(firstName+" is placed in Mid Level Class for QA");
            }else {
                System.out.println(firstName + " is placed in Advanced Level Class for QA");
            }
         }
        else if (Pre=="SE") {
            if (level==1){
                System.out.println(firstName+" is placed in Beginner Level Class for SE");
            } else if (level==2) {
                System.out.println(firstName+" is placed in Mid Level Class for SE");
            }else{
                System.out.println(firstName + " is placed in Advanced Level Class for SE");
            }
            
        }else if(Pre=="DA"){
            if (level==1){
                System.out.println(firstName+" is placed in Beginner Level Class for DA");
            } else if (level==2) {
                System.out.println(firstName+" is placed in Mid Level Class for DA");
            }else {
                System.out.println(firstName + " is placed in Advanced Level Class for DA");
                  }
                }
        else {
            System.out.println("Invalid Selection");
        }
    }
}
