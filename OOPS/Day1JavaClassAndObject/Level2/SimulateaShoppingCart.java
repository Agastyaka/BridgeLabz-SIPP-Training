class cartitems{
    String itemname;
    double price;
    int quantity;
    cartitems(String itemnam,double pric,int qu){
        itemname=itemnam;
        price=pric;
        quantity=qu;
    }
    public void itemadd(){
        System.out.println("the item is added in kart"+itemname);
    }
    public void itemremoved(){
        System.out.println("the item is removed "+itemname);
    }
    public void display(){
        System.out.println("cost"+price*quantity);
    }

}

public class SimulateaShoppingCart {
    public static void main(String[] args) {
        cartitems item1=new cartitems("pen", 10, 2);
    item1.itemadd();
    item1.display();
    cartitems item2=new cartitems("car", 2345343, 1);
    item2.itemadd();
    item2.display();
    cartitems item3=new cartitems("blue breey", 2, 4);
    item3.itemremoved();
    }

    
}