import java.util.*;
public class TriangularPark {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter side 1");
        double side1=scanner.nextDouble();
         System.out.println("enter side 2");
        double side2=scanner.nextDouble();
         System.out.println("enter side 3");
        double side3=scanner.nextDouble();
        double parameter=side1+side2+side3; 
        int noOfRound= (int)(5000/parameter);
        System.out.println(" The total number of rounds the athlete will run is"+noOfRound+"to complete 5 km");
    }
}