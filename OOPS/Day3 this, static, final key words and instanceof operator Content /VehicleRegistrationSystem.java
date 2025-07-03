class vehicle{
    static double registrationfee =543;
    public static void updateregistration(double newregistration){
        registrationfee=newregistration;
    }
    String ownername;
    String vehicletype;
    final int registrationo;
    vehicle(String owenername,String vehicletype,int registationo){
        this.ownername=owenername;
        this.vehicletype=vehicletype;
        this.registrationo=registationo;
    }
    public void display(){
        System.out.println("registration fee"+registrationfee);
        System.out.println("owener name"+ownername);
        System.out.println("vehicle type"+vehicletype);
        System.out.println("vehicle registration"+registrationo);
    }

}

public class VehicleRegistrationSystem {

    public static void main(String[] args) {
        
        vehicle vehicle1=new vehicle("ram", "car", 54321);
        if(vehicle1 instanceof vehicle){
            System.out.println("vehicle1 instanceof vehicle");
            vehicle1.display();
            System.out.println("change registration fee");
            vehicle.updateregistration(654);
            vehicle1.display();
        }
        
    }
}