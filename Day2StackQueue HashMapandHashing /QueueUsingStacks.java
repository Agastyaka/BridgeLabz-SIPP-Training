import java.util.*;
public class QueueUsingStacks {

    Stack <Integer> enque=new Stack<>();
    Stack <Integer> deque=new Stack<>();
    public void enqueue(int data){
        enque.push(data);
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty. cannot dequeue");
        }
        if(deque.isEmpty()){
            while (!enque.isEmpty()) {
            deque.push(enque.pop());

                
            }
        }
        return deque.pop();
    }
    public int peek(){
        if(isEmpty()){
           System.out.println("Queue is empty. Nothing to peek.");
            return -1;

            
        }
        if (deque.isEmpty()) {
            while (!enque.isEmpty()) {
                deque.push(enque.pop());
            }
            
        }
        return deque.peek();
    }
      public boolean isEmpty() {
        return enque.isEmpty() && deque.isEmpty();
    }    
    public static void main(String[] args) {
        QueueUsingStacks q=new QueueUsingStacks();
        q.enqueue(22);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("deque"+q.dequeue());
        System.out.println("peek"+q.peek());
        System.out.println("deque"+q.dequeue());
        System.out.println("deque"+q.dequeue());
        System.out.println("deque"+q.dequeue());
        System.out.println("deque"+q.dequeue());
       
    }

    
}
