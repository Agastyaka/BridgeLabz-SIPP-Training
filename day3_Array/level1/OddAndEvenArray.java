import java.util.*;
public class OddAndEvenArray {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num = scanner.nextInt();
        if(num<1)
        System.out.println("error exit the program");
        else{
            int []even=new int[num/2+1];
            int []odd=new int[num/2+1];
            int evenIndex =0;
            int oddIndex=0;
            for(int i=1;i<=num;i++){
                if(i%2==0){
                    even[evenIndex]=i;
                    evenIndex++;
                }
                else{
                    odd[oddIndex]=i;
                    oddIndex++;
                }

            }
            System.out.println("even number");
            for(int i=0;i<=even.length-1;i++){
                System.out.println(even[i]);
            }
            System.out.println("odd number");
            for(int i=0;i<=odd.length-1;i++){
                System.out.println(odd[i]);
            }


        }
    }
}