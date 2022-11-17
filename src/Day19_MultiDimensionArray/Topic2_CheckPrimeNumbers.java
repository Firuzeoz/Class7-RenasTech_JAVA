package Day19_MultiDimensionArray;

public class Topic2_CheckPrimeNumbers {
    public static void main(String[] args) {

    }

    public static boolean checkPrimeNumbers(int param1) { // my return type will be boolean either t or f
        boolean isItPrimeNumber=true;
        for (int i = 2; i <=param1 ; i++) {

            if((param1%i==0) ){
                isItPrimeNumber=false;
            }

        }return isItPrimeNumber;
    }
}

