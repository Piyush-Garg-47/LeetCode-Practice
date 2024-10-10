import java.util.*;

public class LongestSubArrayGFG {
    public static int lenOfLongSubarr (int A[], int n, int K) {


        //This function is written by bruteforce approach 
        // int len = 0 ;
        // for(int i =0 ; i< n ; i++){
        //     for(int j =i ; j<n ;j++){
        //         int sum = 0 ;
        //         for(int P =i ; P<= j ;P++){
        //               sum +=A[P] ;
        //         }
        //         if(sum==K){
        //             len=Math.max(len,j-i+1);
        //         }
        //     }
        // }
        // return len;


        /*Batter approach for sholving this qustion 
        Map<Integer , Integer> preSumMap = new HashMap<>();
        int sum = 0 ; 
        int maxlen = 0 ;
        for(int i = 0 ; i<n ; i++){

           sum +=A[i] ;


           if(sum == K){
            maxlen=Math.max(maxlen, i+1);
           }

           int rem = sum - K ;

           if(preSumMap.containsKey(rem)){
                int len = i-preSumMap.get(rem);
                maxlen = Math.max(maxlen, len) ; 
           }

           if (!preSumMap.containsKey(sum)) {
            preSumMap.put(sum, i);
            }
        }
        return maxlen;
         */

         //optiaml solution of this qustion 

        /*  int left = 0 , right = 0 ;
         int sum = A[0];
         int maxlen = 0 ; 

         while(right < n ){

            while (left <= right && sum > K){
                sum -= A[left];
                 left ++ ; 
            }
            if(sum == K){
                maxlen = Math.max(maxlen, right - left + 1);
             }
             right++;
             if (right < n) sum +=A[right];

         }

         return maxlen ;
         */  // only for positive integer ; 
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        int n =a.length ;
        int len =  lenOfLongSubarr(a,n, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
