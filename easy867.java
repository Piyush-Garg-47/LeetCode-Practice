import java.util.*;
public class easy867 {
    public static  int[][] transpose(int[][] matrix) {
        int rows = matrix.length ; 
        int cols = matrix[0].length ; 
         int ans [] [ ] = new int [cols] [ rows] ; 
         for(int i = 0 ; i< rows ; i++){
            for (int j = 0 ;j< cols ; j++){
                ans [j] [i] = matrix[i][j] ;
            }
         }
         return ans ; 
    }
    public static void main(String[] args) {
        int matrix [] [] ={ {1,2,3},{4,5,6},{7,8,9} };
System.out.print(Arrays.deepToString(transpose(matrix)));
}
}