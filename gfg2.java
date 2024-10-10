import java.util.Arrays;

public class gfg2 {
   public static   int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr) ;
            for(int i = n-2 ; i>=0 ; i--){
                if(arr[i] != arr[i+1]){
                    return arr[i] ;
                }
            }
            return -1 ; 
        }
         
       

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
       int  n = 6;
      System.out.println(print2largest(arr, n));
   }

}
