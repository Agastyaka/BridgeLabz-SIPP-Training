import javax.print.DocFlavor.STRING;

class Vehicle{
    int maxspeed;
    String fueltype;
    Vehicle(int maxspeed,String fueltype){
        this.maxspeed=maxspeed;
        this.fueltype=fueltype;
    }
    void display(){
        System.out.println("maxspeed"+maxspeed);
        System.out.println("fueltype of vehicle"+fueltype);
    }
}
class Car extends Vehicle{
    int seatscapacity;
    Car(int maxspeed,String fueltype,int seatscapacity){
        super(maxspeed, fueltype);
        this.seatscapacity=seatscapacity;
    }
    void display(){
        super.display();
        System.out.println("seat capacity of car is"+seatscapacity);
    }
}
class Truck extends Vehicle{
    int loadcapacity;
    Truck(int maxspeed,String fueltype,int loadcapacity){
        super(maxspeed, fueltype);
        this.loadcapacity=loadcapacity;
    }
    @Override
    void display(){
        super.display();
        System.out.println("load capacity of truck"+loadcapacity);

    }
}
class Bike extends Vehicle{
    boolean hascarrier;
    Bike(int maxspeed,String fueltype,boolean hascarrier){
        super(maxspeed, fueltype);
        this.fueltype=fueltype;
    }
    @Override
    void display (){
        super.display();
        System.out.println("has carrer"+(hascarrier ? "No" : "yes"));
    }
}
public class VehicleTransportSystem {

    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Car(213, "petrol", 4);
        vehicles[1]=new Truck(32, "desil", 2);
        vehicles[2]=new Bike(234, "pertol", true);
        for(int i=0;i<=vehicles.length-1;i++){
            vehicles[i].display();
        }

    }
}
