import java.util.*;
public class MeanHeight {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double [] height = new double[11];
        System.out.println("enter height of team");
        for(int i=0;i<=height.length-1;i++){
            height[i]=scanner.nextDouble();
        }
        double sum=0;
        for(int i=0;i<=height.length-1;i++){
            sum = sum +height[i];
        }
        double mean = sum/11;
        System.out.println("mean height of team"+mean);
    }
}