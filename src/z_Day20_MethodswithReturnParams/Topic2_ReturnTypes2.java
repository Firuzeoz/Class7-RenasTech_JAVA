package z_Day20_MethodswithReturnParams;

public class Topic2_ReturnTypes2 {
   public static void main(String[] args) {
       String Firuste = Frz(4,5);
       System.out.println("The name is : "+Firuste);
       System.out.println("The name is : "+Frz(9,9));
   }
    public static String Frz(int a, int b){
        if(a>b){
            return "Firuze";
        }else if(b>a){
            return "Bibi";
        }else{
            return "Firuzan";
        }
    }

}
