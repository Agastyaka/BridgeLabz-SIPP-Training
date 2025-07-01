class Vechicle{
    String ownername;
    String Vechicletype;
static double registrationfee;
Vechicle(String ownername,String Vechicletype){
    this.ownername=ownername;
    this.Vechicletype=Vechicletype;
    registrationfee=1234;
}
public void dispaly(){
    System.out.println("owner name"+ownername);
    System.out.println("vechicle type"+Vechicletype);
    System.out.println("regisrtraton fee"+registrationfee);
}
public static void registrationfeeupdate(double newfee){
    registrationfee=newfee;
}


}

public class VechicleRegistration {
    public static void main(String[] args) {
        Vechicle vechicle1=new Vechicle("raman", "bike");
    vechicle1.dispaly();
    Vechicle.registrationfeeupdate(2344);
    vechicle1.dispaly();
        
    }
    


    
}