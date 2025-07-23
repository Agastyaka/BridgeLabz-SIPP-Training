import java.util.LinkedList;
import java.util.Queue;
public class TicketCounterManagement {

    public static void main(String[] args) {
        Queue <String> ticketqQueue=new LinkedList<>();
        ticketqQueue.add("custormer1");
        ticketqQueue.add("customer2");
        ticketqQueue.add("customer 3");
        ticketqQueue.add("customer 4");
         System.out.println("Initial Queue: " + ticketqQueue);
         while (!ticketqQueue.isEmpty()) {
            System.out.println(ticketqQueue.peek()+"is being served");
            ticketqQueue.remove();
             System.out.println("Queue after serving: " + ticketqQueue);

         }
         System.out.println("all customer served");

    }
}