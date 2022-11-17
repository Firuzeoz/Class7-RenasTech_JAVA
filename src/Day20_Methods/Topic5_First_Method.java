package Day20_Methods;

public class Topic5_First_Method {//We are avoiding redundancy and organizing our code using METHODS
                                   //We have to have a class in order to have a method, we'll see this later
    public static void PrintName(){
        System.out.println("My name is Firuze");
    }


    public static void main(String[] args) {  // we are using MAIN to CALL METHODS ,because main is our door of our home
                                              //order of calling methods in main is important
                                             // methods orders before or later main is not important
        System.out.println("This is the Main Method Execution!");
        PrintName();
        PrintLastName();
    }


    public static void PrintLastName(){
        System.out.println("My last name is OZ");

    }

}
