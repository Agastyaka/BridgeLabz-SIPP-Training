import java.util.Scanner;

public class ParkingLotGateSystem {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Parking space aavailable");
        int Parkingspace=10;
        while (true) {
            if(Parkingspace<0){
                System.out.println("parking is full");
                break;
            }
        
            System.out.println("what you want ");
            System.out.println("Park choose 1");
            System.out.println("exit parking  choose 2");
            System.out.println("occupansy choose3");
            System.out.println("choose -1 to exit fully");
            int choise=scanner.nextInt();
            switch (choise) {
                case 1:
                System.out.println("car is park");
                Parkingspace--;
                    
                    break;
                case 2:
                System.out.println("exit parking space");
                Parkingspace++;
                break;
                case 3:
                System.out.println("space left "+Parkingspace);
                break;
            
                
                    
            }
            if(choise== -1){
            System.out.println("parking space left"+Parkingspace);
            break;
        }
            
        }
        
        if(Parkingspace ==0){
            System.out.println("no space available");
        }
        
    }
}