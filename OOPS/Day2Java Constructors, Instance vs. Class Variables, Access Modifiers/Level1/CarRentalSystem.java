class Carrental{
    String custormername;
    String carmodel;
    int rentaldays;
    double costperday=400.00;
    Carrental(String costomer,String car,int rent){
        custormername=costomer;
        carmodel=car;
        rentaldays=rent;
    }
    public double totalcost(){
        double totalcost=costperday*rentaldays;
        return totalcost;

    }
    void display(){
        System.out.println("name of customer. "+custormername);
        System.out.println("mode of car. "+carmodel);
        System.out.println("total rent days"+rentaldays);
        System.out.println("total cost "+totalcost());

    }

}


public class CarRentalSystem {
    public static void main(String[] args) {
        Carrental car1=new Carrental("Jame", "porsche", 5);

        car1.display();
       
    }

    
}