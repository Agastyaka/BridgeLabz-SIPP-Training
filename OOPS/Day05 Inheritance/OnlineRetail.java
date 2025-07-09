class Order{
    int orderid;
    String orderdate;
    Order(int orderid,String orderdate){
        this.orderdate=orderdate;
        this.orderid=orderid;
    }
    
    void display(){
        System.out.println("order placed"+orderid);
    }
    
}
class ShipedOrder extends Order{
    int shipmentno;
    ShipedOrder(int orderid,String orderdate,int shipmentno){
        super(orderid, orderdate);
        this.shipmentno=shipmentno;
    }
    @Override
    void display(){
        System.out.println("order shiped"+shipmentno);
    }

}
class DeliverdOrder extends Order{
    String deliverydate;
    DeliverdOrder(int orderid,String orderdate,String deliverydate){
        super(orderid, orderdate);
        this.deliverydate=deliverydate;
    }
    void display(){
        System.out.println("order deliver on"+deliverydate);
    }
}
public class OnlineRetail {

    public static void main(String[] args) {
        Order o1=new Order(5432, "23 dec 2025");
        ShipedOrder s1=new ShipedOrder(5432, "25 dec 2025", 654);
        DeliverdOrder d1=new DeliverdOrder(6543, "23456", "29 dec 2025");
        o1.display();
        s1.display();
        d1.display();
    }
}