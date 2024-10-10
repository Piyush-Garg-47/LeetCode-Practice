import java.util.Arrays;

public class medium73 {
    public  static void setZeroes(int[][] matrix) {
        int  m = matrix.length ;
        int n = matrix[0].length ; 
        boolean isrow = false ; 
        boolean iscol =false ; 
        for(int i = 0 ; i<m ; i++){
            for (int j = 0 ; j< n ; j++){
                if(matrix[i][j] ==0 ){
                    matrix[i][0] = 0 ;
                    matrix[0][j] =0 ;
                    if(i == 0) isrow = true ;
                    if(j==0 )iscol = true ;
                }
            }
        }
        for(int i = 0 ; i<m ; i++){
            for (int j = 0 ; j< n ; j++){
                if(matrix[i][0] ==0 || matrix[0][j] ==0 ){
                    matrix[i][j] =0 ;
                }
            }
        }
        if(isrow){
            for(int i = 0 ; i<n ; i++) {
                matrix[0][i] =0; 
            }
        }
        if(iscol){
            for(int i = 0 ; i<m ; i++) {
                matrix[i][0] =0; 
            }
        }
    }
    public static void main(String[] args) {
        int matrix [][] = {{1,1,1} , {1,0,1} , {1,1,1}}  ;
      
        setZeroes(matrix); // Call the function to set zeroes
        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }  
    }
}
