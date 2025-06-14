import java.util.*;
public class springSeason {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter month");
        int month = scanner.nextInt();
        System.out.println("enter day");
        int day = scanner.nextInt();
        if(month == 3 && day >=20 ){
            System.out.println("spring season");
        }
        else if(month>3 && month<6){
            System.out.println("spring season");

        }
        else if(month == 6 && day <=20){
            System.out.println("spring season");
        }
        else
        System.out.println("not a spring season");
        
        
    }
}