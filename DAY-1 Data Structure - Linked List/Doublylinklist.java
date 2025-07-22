class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class Doublylist{
    private Node head;
   private Node tail;
   Doublylist(){
    head=null;
    tail=null;
   }
   public void insertAtBeginning(int data){
    Node node1=new Node(data);
    if(head==null){
        head=tail=node1;
    }
    else{
        node1.next=head;
        head.prev=node1;
        head=node1;
    }
   }
   public void insertatEnd(int data){
    Node node2=new Node(data);
    if(tail==null){
        tail=head=node2;
    }
    else{
        tail.next=node2;
        node2.prev=tail;
        tail=node2;
    }

   }
   public void insertAtPosition(int data,int position){
    if(position == 1){
        insertAtBeginning(data);
    }
    Node node3=new Node(data);
    Node temp=head;
    for(int i=0;i<position-1 && temp!=null;i++){
        temp=temp.next;
    }
    node3.next=temp.next;
    node3.prev=temp;
    if(temp.next!=null){
        temp.next.prev=node3;
    }
    else{
        tail=node3;
    }
    temp.next=node3;
   }
 public void deleteatspecific(int position){
    if(head == null){
        System.out.println("List is empty");
        return;
    }

    if(position == 1){
        if(head.next != null){
            head = head.next;
            head.prev = null;
        } else {
            head = tail = null;
        }
        return;
    }

    Node temp = head;
    for(int i=1; i<position && temp!=null; i++){
        temp = temp.next;
    }

    if(temp == null){
        System.out.println("Position out of range");
        return;
    }

    if(temp.next != null){
        temp.next.prev = temp.prev;
    } else {
        tail = temp.prev;
        tail.next = null;
    }

    if(temp.prev != null){
        temp.prev.next = temp.next;
    }
}

   public void traversalForward(){
    Node temp=head;
    System.out.println("forward");
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;

    }
}
public void backwardtraversal(){
    Node temp=tail;
    System.out.println("backward");
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.prev;
    }
}
}
public class Doublylinklist {

    public static void main(String[] args) {
        Doublylist list1=new Doublylist();
        list1.insertatEnd(10);
        list1.insertatEnd(20);
        list1.insertAtBeginning(5);
        list1.insertAtPosition(30, 3);
        list1.traversalForward();
        list1.backwardtraversal();
        list1.deleteatspecific(1);
        list1.traversalForward();
        list1.deleteatspecific(2);
        list1.traversalForward();
    }
}