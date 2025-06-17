import java.util.*;
public class MultidimentionalArray {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
    System.out.println("enter row");
    int row=scanner.nextInt();
    System.out.println("enter column");
    int column=scanner.nextInt();
    int [][] arr2d=new int [row][column];
    int [] arr1d=new int[row*column];
    System.out.println("input 2d arr");
     for(int i=0;i<=row-1;i++){
         for(int j=0;j<=column-1;j++){
            arr2d[i][j]=scanner.nextInt();
         }
     }
    
    int index=0;
    for(int i=0;i<=row-1;i++){
        for(int j=0;j<=column-1;j++){
            arr1d[index]=arr2d[i][j];
            index++;
        }
    }
    System.out.println("2D array to 1D array");
    for(int i=0;i<=arr1d.length-1;i++)
    System.out.println(arr1d[i]);
    
}
    }

    