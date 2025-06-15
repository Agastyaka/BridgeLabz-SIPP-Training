import java.util.*;
public class oddAndEven {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num<1)
        System.out.println("not possible");
        else{

System.out.println("even no");
            for(int i=1;i<=num;i++){
                if(i%2 == 0)
                System.out.println(i);

            }
            System.out.println("odd no");
            for(int j=1;j<=num;j++)
            if(j%2!=0)
                System.out.println(j);
        }
    }
}