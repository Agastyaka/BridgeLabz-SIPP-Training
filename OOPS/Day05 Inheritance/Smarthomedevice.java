class Device{
    String deviceid;
    String status;
    Device(String deviceid,String status){
        this.deviceid=deviceid;
        this.status=status;
    }
    void display(){
        System.out.println("device id"+deviceid);
        System.out.println("devide status"+status);
    }
}
class Thermastat extends Device{
    int tempsetting;
    Thermastat(String deviceid,String status,int tempsetting){
        super(deviceid, status);
        this.tempsetting=tempsetting;
    }
    @Override
    void display(){
        super.display();
        System.out.println("temp setting "+tempsetting);
    }
}
public class Smarthomedevice {

    public static void main(String[] args) {
        Thermastat thermastat1=new Thermastat("43221", "on", 23);
        thermastat1.display();
        
    }
}