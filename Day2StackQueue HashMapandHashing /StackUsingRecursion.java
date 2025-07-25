import java.util.*;
public class StackUsingRecursion {
    public static void sortstack(Stack <Integer>stack){
        if(!stack.isEmpty()){
            int top=stack.pop();
            sortstack(stack);

        }
    }
    public static void insertinsortedorder(Stack<Integer>stack,int element){
        if(stack.isEmpty() || element>=stack.peek()){
            stack.push(element);
            return;
        }
        int top=stack.pop();
        insertinsortedorder(stack, element);
        stack.push(top); 
    }

    public static void main(String[] args) {
          Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        sortstack(stack);

        System.out.println("Sorted Stack (Top -> Bottom):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        
    }
}