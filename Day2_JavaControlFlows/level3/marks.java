import java.util.*;
public class marks {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter marks in physics");
        int marks1=scanner.nextInt();
        System.out.println("enter marks in chemistry");
        int marks2=scanner.nextInt();
        System.out.println("enter marks in math");
        int marks3=scanner.nextInt();
        double percentage= (marks1+marks2+marks3)*100/300;
        System.out.println("percentage is"+percentage);
          if (percentage >= 80) {
            System.out.println("grade A");
        } else if (percentage >= 70) {
            System.out.println("grade b");
            
        } else if (percentage >= 60) {
           System.out.println("grade C");
        } else if (percentage >= 50) {
            System.out.println("grade D");
        } else if (percentage >= 40) {
           System.out.println("grade E");
        } else {
            System.out.println("R");
        }

        

    }
}