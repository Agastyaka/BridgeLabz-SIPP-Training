public class MergeSort {
    public static void mergeSort(int arr[],int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right){
        
    }

    public static void main(String[] args) {
        
    }
}