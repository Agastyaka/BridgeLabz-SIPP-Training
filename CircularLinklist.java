class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Circularlist{
    private Node head;
    private Node tail;
    public Circularlist(){
        head=null;
        tail=null;
    }
    public void addfirst(int data){
        Node node1=new Node(data);
        if(head==null){
            head=node1;
            tail=node1;
            node1.next=head;
        }else{
            node1.next=head;
            tail.next=node1;
            head=node1;
        }
       
    }
    public void addendd(int data){
        Node node2=new Node(data);
        if(head==null){
            tail=node2;
            head=node2;
            node2.next=head;
        }
        else{
            tail.next=node2;
            node2.next=head;
            tail=node2;
        }
    }
    void delete(int key){
        if(head==null)
        return;
        if(head == tail && head.data==key){
            head=null;
            tail=null;
            return;
        }
        if(head.data==key){
            tail.next=head.next;
            head=head.next;
            return;
        }
       Node prev =head;
       Node curr=head.next;
        while (curr !=head && curr.data !=key) {
            prev=curr;
            curr=curr.next;
        }
        if(curr ==head){
            System.out.println("element not found");
            return;
        }
        prev.next=curr.next;
        if(curr==tail){
            tail=prev;
        }
    }
    public void traverse(){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        System.out.println(head.data+" ");

        Node temp=head.next;
        while(temp!=head){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    System.out.println();
    }

}
public class CircularLinklist {

    public static void main(String[] args) {
        Circularlist list1=new Circularlist();
        list1.addendd(2);
        list1.addendd(4);
        list1.addfirst(5);
        list1.addfirst(6);
        list1.traverse();
        list1.delete(5);
        list1.traverse();
        
    }
}