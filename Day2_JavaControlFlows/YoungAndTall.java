import java.util.*;
public class YoungAndTall {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter age of Amar");
        int age1=scanner.nextInt();
        System.out.println("enter height of amar");
        int height1=scanner.nextInt();
        System.out.println("enter age of akbar");
        int age2=scanner.nextInt();
        System.out.println("enter height of akbar");
        int height2=scanner.nextInt();
        System.out.println("enter age of Anthony");
        int age3=scanner.nextInt();
        System.out.println("enter height of anthony");
        int height3=scanner.nextInt();
        if(age1<age2 && age1<age3)
        System.out.println("Amar is youngest");
        else if(age2<age1 && age2<age3)
        System.out.println("akbar is youngest");
        else if(age3<age1 && age3<age2)
        System.out.println("anthony is youngest");

        if(height1>height2&&height1>height3)
        System.out.println("amar is tallest");
        else if(height2>height1&&height2>height3)
        System.out.println("akabr is tallest");
        else if(height3>height1&&height3>height2)
        System.out.println("anthony is tallest");
    }
}