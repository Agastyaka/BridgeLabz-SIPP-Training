import java.util.Scanner;

import java.util.* ;
public class prime {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num =scanner.nextInt();
        boolean result=true;
        if(num <= 1){
            result=false;
        System.out.println(result);
    }
    else{
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                result=false;
                break;
            }
        }
        System.out.println(result);
    }
    }
}