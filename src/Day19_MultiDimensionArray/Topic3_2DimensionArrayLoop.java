package Day19_MultiDimensionArray;

public class Topic3_2DimensionArrayLoop {
    public static void main(String[] args) {
        String [][] names={{"Ziya","Seda"},{"Sena","Anil","Hrakar"}, {"Ferah","Onder","Fahrettin","Amer"}};

        for (int i = 0; i < names.length ; i++) { //Outer loop for outer Array
            System.out.println("The row "+i+":");


           for (int j = 0; j <names[i].length ; j++) { //Inner loop for Inner Loop
            System.out.print(names[i][j]+ " "); //Each index in Arrays in row "+i+"
                                                //print kullandik println yerine,yanyana geldi arraydeki isimler
            }
            System.out.println();
        }



    }
}
