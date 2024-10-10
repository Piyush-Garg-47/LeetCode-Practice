import java.util.Arrays;

public class medium48 {
    public  static void rotate(int[][] matrix) {
        int n =matrix.length ;
         for(int col = 0 ; col <n ; col++){
            int i = 0 ; // 0th row 
            int  j = n-1 ;// last row 
            while(i<=j){
                int temp = matrix[i][col] ;
                matrix[i][col] =matrix[j][col];
                matrix[j][col] = temp ; 
                i++ ; 
                j-- ; 
            }

         }
         for(int i = 0 ; i< n ; i++){
            for(int j =i+1 ; j< n ; j++){
                 int temp = matrix[i][j] ;
                 matrix[i][j] = matrix[j][i] ;
                 matrix[j][i] =temp  ; 
            }
         }
    }
    public static void main(String[] args) {
        int matrix [][] ={{1,2,3} , {4,5,6}, {7,8,9}};
        rotate  (matrix); // Call the function to set zeroes
        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }  
         
    }
}
