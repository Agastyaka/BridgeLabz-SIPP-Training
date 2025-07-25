import java.util.*;
public class StockSpan {
 public static int [] calculatespan(int [] prices){
    Stack <Integer> stack=new Stack<>();
    int []span=new int[prices.length];
    for(int i=0;i<=prices.length-1;i++){
        while (!stack.empty() && prices[stack.peek()] <= prices[i]) {
            stack.pop();
            
        }
        if(stack.empty()){
            span[i]=i+1;
        }
        else{
            span[i]=i-stack.peek();
        }
    }
    return span;

}
public static void main(String[] args) {
    int [] prices={12,23,34,45,56,67,87};
    int[] result=calculatespan(prices);
    for(int s:result){
        System.out.print(s+" ");

    }
    
}

    
}
