public class gfg1 {
    public static int largest(int arr[], int n)
    {
        int m = 0 ;
        for(int i= 0 ;i< n ;i++){
    
          
          if(arr[i] > m ){
               m =  arr[i] ;
         }
           
        }
        return m ;
    }
    public static void main(String[] args) {
     int    n = 5 ;
      int arr[] = {1, 8, 7, 56, 90} ; 
   System.out.println(largest( arr,  n));
    }
}
