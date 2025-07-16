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
class DoubleLinklist{
    private Node head;
    private Node tail;
    DoubleLinklist(){
        head=null;
        tail=null;
    }
    void insersertatbegning(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }
    void insertatend(int data){
        Node node2=new Node(data);
        if(tail==null){
            head=tail=node2;
        }
        else{
            tail.next=node2;
            node2.prev=tail;
            tail=node2;
        }

    }
    void atspecificposition(int data,int position){
        if(position ==1){
            insersertatbegning(data);

        }
        Node node3=new Node(data);
        Node temp=head;
        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("position out of range");
            
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
}