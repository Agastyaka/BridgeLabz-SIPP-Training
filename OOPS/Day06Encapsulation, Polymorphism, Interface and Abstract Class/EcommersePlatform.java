import java.util.ArrayList;

abstract class Product{
    private int productid;
    private String productname;
    private double price;
    Product(int productid,String productname,double price){
        this.productid=productid;
        this.productname=productname;
        this.price=price;
    }
    public double getprice(){
        return price;
    }
    public abstract double calculatediscournt();
    public void display(){
        System.out.println("product id"+productid);
        System.out.println("product name"+productname);
        System.out.println("price is"+price);
    }

}
interface Taxable{
    double calculatetax();
    String taxdetail();
}
class Clothing extends Product implements Taxable{
    Clothing(int productid,String name,double price){
        super(productid, name, price);
    }
    @Override
    public double calculatediscournt(){
        return getprice()*0.2;
    }
    @Override
    public double calculatetax(){
        return getprice()*0.05;
    }
    @Override
    public String taxdetail(){
        return "clothing tax is:5%";

    }
    @Override
    public void display(){
        super.display();
        System.out.println("discount"+calculatediscournt());
        System.out.println("tax"+calculatetax());
        System.out.println("final price"+getprice()+calculatediscournt()+calculatetax());
    }

    }
    class Electronic extends Product implements Taxable{
        Electronic(int productid,String name,double price){
            super(productid, name, price);
        }
        @Override
        public double calculatediscournt(){
            return getprice()*0.2;
        }
        @Override
        public double calculatetax(){
            return getprice()*0.05;
        }
        public String taxdetail(){
            return"electronic tax is :5%";
        }
        @Override
         public void display(){
        super.display();
        System.out.println("discount"+calculatediscournt());
        System.out.println("tax"+calculatetax());
        System.out.println("final price"+getprice()+calculatediscournt()+calculatetax());
    }
    }
    public class EcommersePlatform {
    
        public static void main(String[] args) {
            ArrayList<Product>product=new ArrayList<>();
            Clothing c1=new Clothing(1234, "tshirt", 3455);
            Electronic e1=new Electronic(1234, "mixer", 1234);
            Clothing c2=new Clothing(123, "jeans", 1234);
            product.add(c2);
            product.add(e1);
            product.add(c1);
            for(int i=0;i<=product.size()-1;i++){
                product.get(i).display();

            }
            
        }
    }

