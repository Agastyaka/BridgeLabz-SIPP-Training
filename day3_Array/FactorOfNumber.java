import java.util.*;
public class FactorOfNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int maxFactor=10;
        int []arr=new int[maxFactor];
        int index=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                if(index==maxFactor){
                    maxFactor*=2;
                    int []temp =new int[maxFactor];
                    for(int j=0;j<=index-1;j++){
                        temp[j]=arr[j];
                        
                    }
                    arr=temp;
                }
                arr[index]=i;
                index++;
            }
        }
        System.out.println("factor are");
        for(int i=0;i<=index-1;i++){
            System.out.println(arr[i]);
        }

    }
}