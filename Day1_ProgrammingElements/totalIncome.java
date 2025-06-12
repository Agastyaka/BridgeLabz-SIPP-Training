import java.util.*;
public class totalIncome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter salary");
        int salary = scanner.nextInt();
        System.out.println("wrtie bonus");
        int bonus = scanner.nextInt();
        System.out.println("The salary is INR"+salary+"and the bonus is INR "+bonus+"Hence Total Income is INR"+(bonus+salary));
    }
}