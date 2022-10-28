package Day15_NestedLoops;

public class Topic4_breakAndContinueStatements {
    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            if(i==5){
                continue;
            }
            System.out.println("the i value = " + i);
        }
        System.out.println("**********");
        int j=0;
        while(j<10){
            if(j==7 || j==8){
                j++;
                continue;
            }
            System.out.println("j = " + j);
            j++;
        }
        System.out.println("***********");

        for (int f = 0; f <10 ; f++) {
            System.out.println("From outer loop f value is= " + f);
            for (int r = 1; r < 10; r++) {
                if(r==5 || r==8){
                    continue;// dont print 5 and 8 ,when you see 5 ||8 skip them go with 6 or 9
                }
                System.out.println("\t\tr value= " + r);
            }

        }
        
    }
}
