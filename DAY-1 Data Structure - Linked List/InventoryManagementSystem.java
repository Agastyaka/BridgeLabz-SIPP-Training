class InvontaryNode{
    String itemname;
    int itemid;
    int quantiy;
    double price;
    InvontaryNode next;
    InvontaryNode(String itemname,int itemid,int quantiy,double price){
        this.itemname=itemname;
        this.itemid=itemid;
        this.quantiy=quantiy;
        this.price=price;
        this.next=null;
    }
}
class Invontarymanagementlist{
    private InvontaryNode head;
    public void addatbeggning(String itemname,int itemid,int quantiy,double price){
        InvontaryNode node1=new InvontaryNode(itemname, itemid, quantiy, price);
        node1.next=head;
        head=node1;

    }
    public void addatend(String itemname,int itemid,int quantiy,double price){
        InvontaryNode node2=new InvontaryNode(itemname, itemid, quantiy, price);
        if(head==null){
            head=node2;
            return;
        }
        InvontaryNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node2;
    }
    public void addatspecificpositon(String itemname,int itemid,int quantiy,double price,int position){
        InvontaryNode node3=new InvontaryNode(itemname, itemid, quantiy, price);
        if(position==1){
            addatbeggning(itemname, itemid, quantiy, price);
            return;
        }
        InvontaryNode temp=head;
        for(int i=0;i<position-1;i++){
            temp=temp.next;

        }
        node3.next=temp.next;
        temp.next=node3;
    }
    public void removebyid(int id){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.itemid==id){
            head=head.next;
            return;
        }
        InvontaryNode temp=head;
        while(temp.next !=null && temp.next.itemid!=id){
            temp=temp.next;
        }
        if(temp.next !=null){
            temp.next=temp.next.next;
        }
    }
    public void updatequantity(int id,int newquantity){
        InvontaryNode temp=head;
        while(temp!=null){
            if(temp.itemid==id){
                temp.quantiy=newquantity;
                return;
            }
            temp=temp.next;
        }
    }
    public void search(String query){
        InvontaryNode temp=head;
        boolean found=false;
        while(temp!=null){
            if(String.valueOf(temp.itemid).equals(query)||String.valueOf(temp.itemname).equalsIgnoreCase(query)){
                System.out.println("found"+temp.itemname+" id "+temp.itemid+" qty"+temp.quantiy+" price"+ temp.price);
                found=true;
                return;
            }
            temp=temp.next;

        }
        if(!found){
            System.out.println("item not found");

        }

    }
    public double totalcost(){
        double totalcost=0;
        InvontaryNode temp=head;
        while (temp !=null) {
            totalcost=totalcost + (temp.price*temp.quantiy);
            temp=temp.next;
            
        }
        return totalcost;
    }
    public void displayinvontary(){
        InvontaryNode temp=head;
        if(temp==null){
            System.out.println("invontary is empty");
            return;
        }
        System.out.println("invontary list");
        while (temp!=null) {
            System.out.println(temp.itemname+" id"+temp.itemid+" qty"+temp.quantiy+" price"+temp.price);
            temp=temp.next;
            
        }

    }

}
public class InventoryManagementSystem {

    public static void main(String[] args) {
        Invontarymanagementlist list1=new Invontarymanagementlist();
        list1.addatbeggning("laptop", 234, 33, 23455);
        list1.addatend("mouse", 33, 232, 1234);
        list1.addatbeggning("cpu", 3214, 2134, 234500);
        list1.addatspecificpositon("monitor", 2134, 56434, 234443, 2);
        list1.displayinvontary();
        list1.removebyid(234);
        System.out.println("remove by id");
        list1.displayinvontary();
        System.out.println("searcch");
        list1.search("33");
        System.out.println("search ");
        list1.search("cpu");
        System.out.println("update quantity");
        list1.updatequantity(33, 2);
        list1.search("33");
        System.out.println("total cost "+list1.totalcost());
        

        

    }
}