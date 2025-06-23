import java.util.*;
public class LargestAndSecond {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int number=scanner.nextInt();
        int maxDigit=10;
        int[] digits=new int[maxDigit];
        int index =0;
        while(number!=0){
            if(index==maxDigit){
                maxDigit*=2;
                 int[] temp = new int[maxDigit];
                  for (int i = 0; i <maxDigit; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
             digits[index++] = (int)(number % 10);
            number /= 10;
        }
          int largest = 0;
        int secondLargest = 0;
        
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
        }
        System.out.println("digit:");
        for (int i = index - 1; i >= 0; i--) {
        System.out.print(digits[i] + " ");
        }
        System.out.println("Largest digit: " + largest);
         System.out.println("Second largest digit: " + secondLargest);
         
    }
}