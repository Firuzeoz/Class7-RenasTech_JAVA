package Day17_ArraysCont;

public class Topic2_ArraySwap {
    public static void main(String[] args) {
        String []  names= {"Ziya", "Hrakar", "Firuze"};
        //swap the "Firuze" with "Hrakar" and later swap "Ziya" with "Hrakar"

         // names[2]= names[1];// {"Ziya" ,"Hrakar" , "Hrakar"}
        String dummy= names[2];  // we are using dummy in here as a temprorary variable!!!!!!!!!
        names[2]=names[1]; /// {"Ziya", "Hrakar","Hrakar"}
        names[1]=dummy; //{"Ziya","Firuze","Hrakar"}

        dummy=names[0];
        names[0]=names[2];//{"Hrakar","Firuze","Hrakar"}
        names[2]=dummy ;//{"Hrakar","Firuze", "Ziya"}


        System.out.println("{ " +names[0]+", "+names[1]+", "+names[2]+" }");



    }
}
