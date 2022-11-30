package Day31_CollectionFramework;

import java.util.Stack;

public class Topic6_Stack {
    public static void main(String[] args) {
        Stack<String> MyStack=new Stack<>();
        // push() method
        // to add an element on top of the stack
        MyStack.push("Dog");
        MyStack.push("Horse");
        MyStack.push("Cat");

        System.out.println("MyStack = " + MyStack);
    }
}
