import java.util.*;
public class MatrixManupulation {
    public static double [][]matrix(int rows,int cols){
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int)(Math.random()*10);
        return matrix;
    }
    public static double [][] transpose(double arr[][]){
        int row=arr.length;
        int col=arr[0].length;
        double [][]transpose=new double[col][row];
          for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }
    public static double detrmenent(double arr[][]){
        return arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];

    }
    public static void display(double [][]matrix){
        for(int i=0;i<=matrix.length-1;i++){
            for(int j=0;j<=matrix[0].length-1;j++){
                System.err.print(matrix[i][j]+"  ");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("row");
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        double matrix[][]=matrix(row, col);
        display(matrix);
        System.err.println("transpose");
        double [][]transpose=transpose(matrix);
        display(transpose);
        System.err.println("determinant of 2x2:"+detrmenent(matrix));
        
    }
}