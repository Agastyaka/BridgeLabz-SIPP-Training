import java.util.*;
public class PositvieNeagtiveZero {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []arr=new int [5];
        System.out.println("enter 5 integer:");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<0)
            System.out.println(arr[i]+"is negative number");
            else if(arr[i]==0)
            System.out.println(arr[i]+"is zero");
            else
            System.out.println(arr[i]+"is positive number");
        }
        if(arr[0]>arr[arr.length-1])
        System.out.println(arr[0]+">"+arr[arr.length-1]);
        else if(arr[0]==arr[arr.length-1])
        System.out.println(arr[0]+"="+arr[arr.length-1]);
        else 
        System.out.println(arr[0]+"<"+arr[arr.length-1]);
    }
}