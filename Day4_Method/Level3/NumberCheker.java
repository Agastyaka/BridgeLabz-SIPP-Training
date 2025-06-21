import java.util.*;
public class NumberCheker {
    public static int count(int num){
        int numm=num;
        int count =0;
        while(numm!=0){
             numm=numm/10;
            count=count+1;

        }
        return count;
    }
    public static int[] arr(int num,int[]arr){
        int numm=num;
        int count=0;
        while(numm!=0){
            int digit=numm%10;
            arr[count]=digit;
            numm=numm/10;
            count++; 
        }
        return arr;

    }
    public static boolean DuckNumber(int[] arr) {
    
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] == 0) {
            return true; 
        }
    }
    return false; 
}
 public static boolean Armstrong(int[] arr, int num) {
        int sum = 0;
        int power = arr.length;
        for (int i = 0; i <= arr.length-1; i++) {
            sum += Math.pow(arr[i], power);
        }
        return sum == num;
    }
    public static void TwoLargest(int[] arr) {
    int largest = 0;
    int secondLargest = 0;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }
    System.out.println("Largest digit: " + largest);
    System.out.println("Second largest digit: " + secondLargest);
}
public static void TwoSmallest(int[] arr) {
    int smallest = Integer.MAX_VALUE;
    int secondSmallest =  Integer.MAX_VALUE;;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < smallest) {
            secondSmallest = smallest;
            smallest = arr[i];
        } else if (arr[i] < secondSmallest && arr[i] != smallest) {
            secondSmallest = arr[i];
        }
    }
     System.out.println("Smallest digit: " + smallest);
    System.out.println("Second smallest digit: " + secondSmallest);
    }
    public static void arrprint (int arr[]){
        System.err.println("the array is");
        for(int i=0;i<=arr.length-1;i++){
            System.err.println(arr[i]);

        }
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter the num");
        int num=scanner.nextInt();
        int count=count(num);
        System.err.println("count of num is"+count);
        
        int []array=new int[count];
        int []digit=arr(num, array);
        arrprint(digit);
        boolean ducknumber=DuckNumber(digit);
        System.err.println("is duck"+ducknumber);
        boolean Armstrong =Armstrong(digit, num);
        System.err.println(Armstrong);
        TwoLargest(digit);
        TwoSmallest(digit);

        
    }
}