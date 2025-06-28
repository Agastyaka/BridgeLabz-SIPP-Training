class HotelBooking{
    String guestname;
    String roomtype;
    int night;
    HotelBooking(String guestname,String roomtype,int night){
        this.guestname=guestname;
        this.roomtype=roomtype;
        this.night=night;
    }
    HotelBooking(HotelBooking copy){
        this.guestname=copy.guestname;
        this.roomtype=copy.roomtype;
        this.night=copy.night;
    }
    HotelBooking(){
        guestname="raman";
        roomtype="with balcony";
        night=3;
    }
    public void display(){
        System.out.println("enter guest name"+guestname);
        System.out.println("enter room type"+roomtype);
        System.out.println("night"+night);
    }
}
public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking person1= new HotelBooking("Amber", "with balcony", 3);
    HotelBooking person2=new HotelBooking(person1);
    HotelBooking person3 = new HotelBooking();
    person1.display();
    person2.display();
    person3.display();
        
    }
    
    

    
}