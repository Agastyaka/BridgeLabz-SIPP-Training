class Mobilephone{
    String brand;
    int model;
    double price;
    Mobilephone(String brand,int model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;

    }
    public void displaydetails(){
        System.out.println("enter brand"+brand);
        System.out.println("enter model"+model);
        System.out.println("enter price"+price);
    }
}

public class MobilePhoneHandling {
    public static void main(String[] args) {
        Mobilephone phone1=new Mobilephone("apple", 16, 99930);
        Mobilephone phone2=new Mobilephone("samsung",20, 120000);
        phone1.displaydetails();
        phone2.displaydetails();
    }

    
}