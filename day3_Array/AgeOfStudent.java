import java.util.*;
public class ageOfStudent {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int arr[]=new int [10];
        System.out.println("enter age of 10 student");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<=arr.length;i++){
            if(arr[i]<0)
            System.out.println("invalid age");
            else if(arr[i]>=18)
            System.out.println("student of this age"+arr[i]+"can vote");
            else 
            System.out.println("student of this age"+arr[i]+"can not vote");


        }


    }
}