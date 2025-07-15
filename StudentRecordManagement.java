class StudentNode{
    int rollno;
    String name;
    int age;
    String grade;
    StudentNode next;
    StudentNode(int rollno,String name,int age,String grade){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}
class StudentRecordlist{
    private StudentNode head;
    StudentRecordlist(){
        head=null;
    }
    void addstudentatbeggning(int rollno,String name,int age,String grade){
        StudentNode newNode=new StudentNode(rollno, name, age, grade);
        newNode.next=head;
        head=newNode;
    }
    void addstudentatend(int rollno,String name,int age,String grade){
        StudentNode newNode=new StudentNode(rollno, name, age, grade);
        if(head==null){
            head=newNode;
            return;
        }
        StudentNode temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void addatposition(int rollno,String name,int age,String grade,int position){
        if(position==1){
            addstudentatbeggning(rollno, name, age, grade);
            return;
        }
        StudentNode newnode=new StudentNode(rollno, name, age, grade);
        StudentNode temp=head;
        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp ==null){
            System.out.println("position out of range");
        }
        newnode.next=temp.next;
        temp.next=newnode;

    }
    void deletebyrollno(int rollno){
        if(head ==null){
            System.out.println("list is empty");
        }
        if(head.rollno==rollno){
            head=head.next;
        }
        StudentNode temp=head;
        while(temp.next !=null && temp.next.rollno!=rollno){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("roll no not found");
        }
        temp.next=temp.next.next;
    }
    void searchbyrollno(int rollno){
        StudentNode temp=head;
        while(temp !=null){
            if(temp.rollno==rollno){
                System.out.println("roll no found"+temp.rollno+" "+temp.name+" "+temp.age+" "+temp.grade);
                return;
            }
            temp=temp.next;
        }
        System.out.println("roll no not found");

    }
    void updategradebyrollno(int rollno,String newgrade){
        StudentNode temp=head;
        while (temp !=null) {
            if(temp.rollno==rollno){
                temp.grade=newgrade;
                System.out.println("grade updated");
                return;
            }
            
        }
        System.out.println("roll no not found");
    }
    void display(){
        StudentNode temp=head;
        while(temp !=null){
            System.out.println("roll no"+temp.rollno+" name "+temp.name+" age "+temp.age+" grade"+temp.grade);
            temp=temp.next;

        }
    }
}
public class StudentRecordManagement {

    public static void main(String[] args) {
        StudentRecordlist list=new StudentRecordlist();
        list.addstudentatend(12313, "asdf", 23, "B");
        list.addstudentatbeggning(2134, "asfa", 33, "A");
        list.addatposition(102, "fgvd", 22, "A", 2);
        list.display();
        list.searchbyrollno(102);
        list.updategradebyrollno(2134, "C");
        list.display();
        list.deletebyrollno(102);
        list.display();
    }
}