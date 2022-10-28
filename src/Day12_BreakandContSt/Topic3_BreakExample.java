package Day12_BreakandContSt;



public class Topic3_BreakExample {
    // write a code when speed limit is hit, stabilize the speed at the speed limit
    // The speed limit is 75
    public static void main(String[] args) {


        int speed=0;
        for (int i = 0; i <=170 ; i++) { // arac 170  basiyor:)
            speed+=1;//  speed=speed+1;  // speed++  // these are the same
            //this code will run 170 times
            if(speed==75){
                break; // 75e gelince hizlanma
            }
            }
        System.out.println("The speed is: "+speed);

    }
}
