class items{
    int itemcode;
    String itemname;
    double price;
    items(int code,String itemnam, double pric){
        itemcode=code;
        itemname=itemnam;
        price=pric;

    }
    public void displaydetails(){
        System.out.println("item code"+itemcode);
        System.out.println("item name"+itemname);
        System.out.println("item price"+price);
    }
}

public class TrackEnvontary {
    public static void main(String[] args) {
        items item1=new items(221, "ps5", 35000);
        items item2=new items(331, "gta 6", 4000);
        item1.displaydetails();
        item2.displaydetails();
    }

    
}