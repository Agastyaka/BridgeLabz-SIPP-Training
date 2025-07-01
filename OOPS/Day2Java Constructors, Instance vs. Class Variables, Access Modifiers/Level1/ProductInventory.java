class Product{
    String Productname;
    double price;
    static int totalprodust;
    Product(String Productname,double price){
        this.Productname=Productname;
        this.price=price;
        this.totalprodust++;

    }
    public void display(){
    System.out.println("product name"+Productname);
    System.out.println("product price"+price);
}
static public void displaytotalproduct(){
    System.out.println("total product "+totalprodust);
}

}

public class ProductInventory {
    public static void main(String[] args) {
        Product product1=new Product("colgate", 123);
        product1.display();
        Product product2=new Product("ps5", 25034);
        product2.display();
        Product.displaytotalproduct();
    }

    
}