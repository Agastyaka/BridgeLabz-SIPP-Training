import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int candidat1totalvote=0;
        int candidat2totalvote=0;
        int candidat3totalvote=0;
        while (true) {
            System.out.println("enter age");
            int age =scanner.nextInt();
            if(age<=18){
                System.out.println("not eligible for vote");
                break;

            }
            else if(age == -1){
                System.out.println("exit to poll vote");
            }
            else{
                
                System.out.println("enter vote candidate no");
                int vote=scanner.nextInt();
                switch (vote) {
                    case 1:
                    candidat1totalvote++;
                        
                        break;
                    case 2:
                        candidat2totalvote++;
                        break;
                    case 3:
                        candidat3totalvote++;
                        break;
                
                    default:
                    System.out.println("invalid input");
                       
                }

            }
            System.out.println("enter -1 to exit");
            
        }
        System.out.println("vote of candidate 1. :"+candidat1totalvote);
        System.out.println("vote of candidate 2.  :"+candidat2totalvote);
        System.out.println("vote of candiate 3. :"+candidat3totalvote);
    }
}