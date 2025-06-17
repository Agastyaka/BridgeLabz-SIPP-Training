import java.util.*;
public class StoreValue {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       
        double sum=0;
        double []arr=new double [10];
         int i=0;
        while(true){
            System.out.println("enter num");
            double num =scanner.nextInt();
            if(num<=0)
            break;
            if(i==10)
            break;
            arr[i]=num;
            i++;

        }
        System.out.println("entered number");
        for(int j=0;j<=arr.length-1;j++){
            System.out.println(arr[j]);
            sum=sum+arr[j];

        }
        System.out.println("total sum"+sum);
       
       

    }
}