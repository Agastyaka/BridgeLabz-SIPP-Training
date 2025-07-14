import java.util.ArrayList;

abstract class Vechicle{
    private int vechicleno;
    private String vechicletype;
    private double rentalrate;
    Vechicle(int vechicleno,String vehicletype,double rentalrate){
        this.vechicleno=vechicleno;
        this.vechicletype=vehicletype;
        this.rentalrate=rentalrate;
    }
    double getrentalrate(){
        return rentalrate;
    }
    abstract double calculatereantalcost(int days);
    public void display(){
        System.out.println("vehicleno"+vechicleno);
        System.out.println("vehicle type"+vechicletype);
        System.out.println("rental rate"+rentalrate);
    }
}
interface Insurable{
    public double calculateinsaurance();
    public String getdetail();
}
class Car extends Vechicle implements Insurable{
    private int days;
    Car(int vechicleno,String vehicletype,double rentalrate,int days){
        super(vechicleno, vehicletype, rentalrate);
        this.days=days;
    }
    public int getday(){
        return days;
    }

    @Override
    double calculatereantalcost(int days) {
        return getrentalrate()*days;
    }
    @Override 
    public double calculateinsaurance(){
        return 1234;
    }
    public String getdetail(){
        return "cost of insaurance is 2341";
    }
    @Override 
    public void display(){
        super.display();
        System.out.println("rentalcost"+calculatereantalcost(getday()));
        System.out.println("insaurance cost"+calculateinsaurance());

    }
}
class Bike extends Vechicle implements Insurable{
     private int days;
    Bike(int vechicleno,String vehicletype,double rentalrate,int days){
        super(vechicleno, vehicletype, rentalrate);
        this.days=days;
    }
    public int getday(){
        return days;
    }

    @Override
    double calculatereantalcost(int days) {
        return getrentalrate()*days;
    }
    @Override 
    public double calculateinsaurance(){
        return 1323;
    }
    public String getdetail(){
        return "cost of insaurance is 2341";
    }
    @Override 
    public void display(){
        super.display();
        System.out.println("rentalcost"+calculatereantalcost(getday()));
        System.out.println("insaurance cost"+calculateinsaurance());

    }

}
public class VechicalRentalSystem {

    public static void main(String[] args) {
        ArrayList <Vechicle> vechicles=new ArrayList<>();
        Car c1=new Car(432, "Car", 234, 3);
        Bike b1=new Bike(12344, "bike", 236, 6);
        vechicles.add(b1);
        vechicles.add(c1);
        for(Vechicle v:vechicles){
            v.display();
        }
        
    }
}