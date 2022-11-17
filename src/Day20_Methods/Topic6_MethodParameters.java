package Day20_Methods;

public class Topic6_MethodParameters {

    public static void main(String[] args) {

        MyMethod("Firuze",31);
        System.out.println("Cont from here!");
        System.out.println("+++++++++++++++++");
        MyMethod("Amer",24);
        System.out.println("+++++++++++++++++");
        MyMethod("Nawras",30);
        //System.out.println("The name is: " +name+age); you can not use method parameters in main like this,
        //it gives errors cause it defined in methods.But when you entered the inputs in MyMethods it pops up automatically
    }

    public static void MyMethod(String name,int age){ // Input params - have to have the datatype and the name
        System.out.println("My name is : " +name);
        System.out.println("I am "+age+" years old");
    }


}
