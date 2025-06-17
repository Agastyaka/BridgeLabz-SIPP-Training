import java.util.*;
public class MaxNoOfHandshake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of people");
        int noOfPeople = scanner.nextInt();
        int maxNoOfHandshake = (noOfPeople)*(noOfPeople-1)/2;
        System.out.println("no of handshake"+maxNoOfHandshake);
    }
}