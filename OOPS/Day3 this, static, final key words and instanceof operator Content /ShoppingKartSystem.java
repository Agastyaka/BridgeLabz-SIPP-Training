class Product{
    static double discount=20;
    String productname;
    double productprice;
    int quantity;
    final int productid;
    Product(String productname,double productprice,int quantity,int productid){
        this.productname=productname;
        this.productprice=productprice;
        this.quantity=quantity;
        this.productid=productid;
    }
    void display(){
        System.out.println("applied discount"+discount);
        System.out.println("product name"+productname);
        System.out.println("product id"+productid);
        System.out.println("product quantity"+quantity);
        System.out.println("product price"+productprice);
    }

    public static void updatediscount(double newdiscount){
        discount=newdiscount;

    }
}

public class ShoppingKartSystem {
    public static void main(String[] args) {
        Product product1=new Product("ps5", 2345, 20, 6543);
        if(product1 instanceof Product){
            System.out.println("product1 instanceof Product");
            product1.display();
            Product.updatediscount(40);
            product1.display();
        }
    }


    
}