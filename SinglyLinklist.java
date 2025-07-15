class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}
class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }
    void insertAtBeginning(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
}
void insertAtEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = newNode;
}
void insertAtPosition(int data, int position) {
    Node newNode = new Node(data);
    if (position == 1) {
        newNode.next = head;
        head = newNode;
        return;
    }
    Node temp = head;
    for (int i = 1; i < position - 1 && temp != null; i++) {
        temp = temp.next;
    }
    if (temp == null) {
        System.out.println("Position out of range");
        return;
    }
    newNode.next = temp.next;
    temp.next = newNode;
}
void deleteAtBeginning() {
    if (head != null) {
        head = head.next;
    } else {
        System.out.println("List is empty");
    }
}

void deleteAtEnd() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (head.next == null) {
        head = null;
        return;
    }
    Node temp = head;
    while (temp.next.next != null) {
        temp = temp.next;
    }
    temp.next = null;
}
void deleteAtPosition(int position) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (position == 1) {
        head = head.next;
        return;
    }
    Node temp = head;
    for (int i = 1; i < position - 1 && temp != null; i++) {
        temp = temp.next;
    }
    if (temp == null || temp.next == null) {
        System.out.println("Position out of range");
        return;
    }
    temp.next = temp.next.next;
}
void traverse() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}


}



public class SinglyLinklist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.traverse();  

        list.insertAtPosition(15, 3);
        list.traverse();  

        list.deleteAtBeginning();
        list.traverse();  

        list.deleteAtEnd();
        list.traverse();  

        list.deleteAtPosition(2);
        list.traverse();  
    }
}
