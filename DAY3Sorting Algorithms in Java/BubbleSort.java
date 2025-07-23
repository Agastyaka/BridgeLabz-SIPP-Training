import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int arr[]){
        boolean swapped;
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            swapped=false;
            for(int j=0;j<=n-i-2;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
                
            }
            if(!swapped){
                break;
            }
            
        }
    }

    public static void main(String[] args) {
        int []arr={5,4,2,5,3,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}