import java.util.*;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int originalNum = num; 
        int count = 0;
        int temp = originalNum;

        if (temp == 0) {
            count = 1; 
        } else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }
        int[] digitArr = new int[count];
        temp = originalNum; 
        for (int i = count - 1; i >= 0; i--) {
            digitArr[i] = temp % 10;
            temp /= 10;
        }

        int[] frequencyArr = new int[10]; 
         for (int digit : digitArr) {
            frequencyArr[digit]++;
        }
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequencyArr[i] > 0) {
                System.out.println("Digit " + i + ": " + frequencyArr[i] + " times");
            }
        }
    }
}