import java.util.*;
public class FactorOfNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num=scanner.nextInt();
        int maxFactor =10;
        int []factor=new int[maxFactor];
        int index =0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factor[index]=i;
                index++;
            }
            if(index==maxFactor){
                maxFactor=maxFactor*2;
                int [] temp=new int[maxFactor];
                for (int j = 0; j < index; j++) {
                        temp[j] = factor[j];
                    }
                factor=temp;

            }
            factor[index]=i;
            index++;
        }
         System.out.println("Factors of " + num+ " are:");
        for (int i = 0; i < index; i++) {
            System.out.println(factor[i]);
        }
        
    }
}